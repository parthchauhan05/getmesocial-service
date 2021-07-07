package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.exception.InvalidUserNameException;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws InvalidUserNameException {
        if(user.getName().equalsIgnoreCase("root")){
            throw new InvalidUserNameException();
        }
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public Optional<User> getById(@RequestParam(name = "id") String id) {
        return userService.getById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody @Valid User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "id") String userId) {
        userService.deleteUser(userId);
    }
}
