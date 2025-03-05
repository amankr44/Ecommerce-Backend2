package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

    Optional<Product> findByName(String name);

    List<Product> findAllByCreatedDate(LocalDate createdDate);

    List<Product> findAllByCreatedDateAfter(LocalDate createdDate);

    List<Product> findAllByCreatedDateBefore(LocalDate createdDate);

    List<Product> findAllByCreatedDateGreaterThan(LocalDate createdDate);

    List<Product> findAllByCreatedDateGreaterThanEqual(LocalDate createdDate);

    List<Product> findAllByCreatedDateLessThanEqual(LocalDate createdDate);

    List<Product> findAllByCreatedDateBetween(LocalDate fromDate, LocalDate toDate);

    List<Product> findAllByPriceGreaterThan(String price);

    // not work
    Optional<Product> findByNameAndType(String name, String type);

    List<Product> findByNameContaining(String name);

    List<Product> findByNameStartingWith(String name);

    List<Product> findBySizeIn(String size);

    List<Product> findBySizeIn(List<String> size);

    boolean existsByName(String name);






}

