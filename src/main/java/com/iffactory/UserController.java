package com.iffactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserManagementService userManagementService;

    // Add user
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userManagementService.addUser(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getAge());
        return "User added successfully";
    }

    // Get user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userManagementService.displayUserById(id);
    }

    // Get all users
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userManagementService.displayAllUsers();
    }

    // Update user first name
    @PutMapping("/{id}/updateFirstName")
    public String updateFirstName(@PathVariable int id, @RequestParam String newFirstName) {
        userManagementService.updateFirstName(id, newFirstName);
        return "First name updated successfully";
    }

    // Update user email
    @PutMapping("/{id}/updateEmail")
    public String updateEmail(@PathVariable int id, @RequestParam String newEmail) {
        userManagementService.updateEmail(id, newEmail);
        return "Email updated successfully";
    }

    // Delete all users
    @DeleteMapping("/deleteAll")
    public String deleteAllUsers() {
        userManagementService.deleteAllUsers();
        return "All users deleted successfully";
    }
}
