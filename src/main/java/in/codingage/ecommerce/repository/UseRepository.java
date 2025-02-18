package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.User;

import java.util.List;

public interface UseRepository {

    void createUser(User user);

    List<User> getAllUser();

    User updateUser(User user);

    boolean deleteUser(int userId);

    public User getUserDetail(String MobNo);
}
