package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String>{


    Optional<User> findByFirstName(String firstName);

}
