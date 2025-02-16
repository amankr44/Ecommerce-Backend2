package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.impl.ProductRepositoryImpl;
import in.codingage.ecommerce.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    public Product createProduct(Product product) {
         productRepository.createProduct(product);
         return product;

    }

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    public Product updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    public boolean deleteProduct(int productId) {
        return productRepository.deleteProduct(productId);
    }
}
