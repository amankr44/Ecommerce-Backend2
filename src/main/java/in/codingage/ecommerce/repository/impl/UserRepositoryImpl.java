package in.codingage.ecommerce.repository.impl;

import in.codingage.ecommerce.model.User;
import in.codingage.ecommerce.repository.UseRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepositoryImpl implements UseRepository {

    List<User> userList = new ArrayList<>();

    @Override
    public void createUser(User user) {
        if(user!=null){
            userList.add(user);
        }
    }

    @Override
    public List<User> getAllUser() {
       return userList;
    }




    public User updateUser(User user) {
        for(User user1 : userList){
            if(user1.getUserId()==user.getUserId()){
                user1.setFirstName(user.getFirstName());
                user.setLastName(user.getLastName());
                user.setEmail(user.getEmail());
                user.setMobNo(user.getMobNo());
                user.setPassword(user.getPassword());
                return user;
            }

        }
        return null;

    }


    public boolean deleteUser(int userId) {
        for(User user : userList){
            if(user.getUserId()==userId){
                userList.remove(user);
                return true;
            }
        }
        return false;
    }
}
