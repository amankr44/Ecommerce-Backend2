package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProduct();

    Product updateProduct(Product product);

    boolean deleteProduct(int productId);

    public Product getProductDetail(int productId);
}
