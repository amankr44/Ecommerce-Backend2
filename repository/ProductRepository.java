package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

    Product findByName(String name);

    List<Product> findAllByCreatedDate(Date date);



}

