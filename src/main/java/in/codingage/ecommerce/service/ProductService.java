package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product updateProduct(Product product);

    void deleteProduct(String id);

    public Optional<Product> getProductDetail(String id);

    public Product findByTitle(String title);
}
