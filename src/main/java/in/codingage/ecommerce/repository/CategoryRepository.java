package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
    Category findByCategoryType(String categoryType);


}
