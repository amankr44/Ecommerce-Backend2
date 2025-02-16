package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {

     void createProduct(Product product);

     List<Product> getAllProduct();

    public Product updateProduct(Product product);

    public boolean deleteProduct(int productId);
}
