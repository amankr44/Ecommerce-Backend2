package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    List<User> getAllUser();

    User updateUser(User user);

    boolean deleteUser(int userId);

}
