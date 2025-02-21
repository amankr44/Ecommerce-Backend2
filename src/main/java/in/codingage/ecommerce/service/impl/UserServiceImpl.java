package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.User;
import in.codingage.ecommerce.repository.UserRepository;
import in.codingage.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
//    UserRepositoryImpl userRepository = new UserRepositoryImpl();
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
         userRepository.save(user);
         return user;

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


    public User updateUser(User user) {
        return userRepository.save(user);
    }


    public void deleteUser(String id) {
         userRepository.deleteById(id);
    }

    public Optional<User> getUserDetail(String id) {
        return userRepository.findById(id);
    }

    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }
}
