package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    List<User> getAllUser();

    User updateUser(User user);

    void deleteUser(String id);

    public Optional<User> getUserDetail(String id);

    public User findByFirstName(String firstName);

}
