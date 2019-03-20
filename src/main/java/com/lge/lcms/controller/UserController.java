package com.lge.lcms.controller;

import com.lge.lcms.exception.ResourceNotFoundException;
import com.lge.lcms.model.User;
import com.lge.lcms.payload.*;
import com.lge.lcms.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PreAuthorize("( #username == principal.username ) or hasRole('ROLE_ADMIN')")
    @GetMapping("/{username}")
    public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

        UserProfile userProfile = new UserProfile(user.getCreatedAt(), user.getEmail(), user.getId(), user.getName(),
                user.getUpdatedAt(), user.getUsername());

        return userProfile;
    }
}