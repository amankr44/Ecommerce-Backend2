package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.User;
import in.codingage.ecommerce.repository.impl.UserRepositoryImpl;
import in.codingage.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
//    UserRepositoryImpl userRepository = new UserRepositoryImpl();
    @Autowired
    UserRepositoryImpl userRepository;

    @Override
    public User createUser(User user) {
         userRepository.createUser(user);
         return user;

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }


    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }


    public boolean deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }
}
