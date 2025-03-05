package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Carouser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarouserRepository extends MongoRepository<Carouser, String> {
    Carouser findByHeader(String header);

}
