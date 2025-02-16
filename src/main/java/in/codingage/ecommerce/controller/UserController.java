package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.User;
import in.codingage.ecommerce.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    UserServiceImpl userService = new UserServiceImpl();


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @DeleteMapping
    public boolean deleteUser(@RequestParam int userId){
        return userService.deleteUser(userId);
    }
}
