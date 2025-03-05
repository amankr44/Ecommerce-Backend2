package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.User;
import in.codingage.ecommerce.service.UserService;
import in.codingage.ecommerce.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
//    private UserServiceImpl userService;
    private UserService userService;


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


    @GetMapping("/detail")
    public Optional<User> getUserDetail(@RequestParam String id){
        return userService.getUserDetail(id);
    }

    @GetMapping("/firstName")
    public User findByFirstName(@RequestParam String firstName){
        return userService.findByFirstName(firstName);
    }


    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @DeleteMapping
    public void deleteUser(@RequestParam String id){
         userService.deleteUser(id);
    }
}
