package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product updateProduct(Product product);

    void deleteProduct(String id);

    public Optional<Product> getProductDetail(String id);

    Optional<Product> findProductByName(String name);

    List<Product> findAllByCreatedDate(LocalDate createdDate);

    List<Product> findAllByCreatedDateAfter(LocalDate createdDate);

    List<Product> findAllByCreatedDateBefore(LocalDate createdDate);

    List<Product> findAllByCreatedDateGreaterThan(LocalDate createdDate);

    List<Product> findAllByCreatedDateGreaterThanEqual(LocalDate createdDate);

    List<Product> findAllByCreatedDateLessThanEqual(LocalDate createdDate);

    List<Product> findAllByCreatedDateBetween(LocalDate fromDate, LocalDate toDate);

    List<Product> findAllByPriceGreaterThan(String price);

    Optional<Product> findByNameAndType(String name, String title);

    List<Product> findByNameContaining(String name);

    List<Product> findByNameStartingWith(String name);

    boolean existsByName(String name);

    List<Product> findBySizeIn(String size);

    List<Product> findBySizesIn(List<String> size);



}
