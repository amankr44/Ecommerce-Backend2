package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.impl.ProductRepositoryImpl;
import in.codingage.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

//    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Autowired
    private ProductRepositoryImpl productRepository;

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

    public Product getProductDetail(int productId) {
        return productRepository.getProductDetail(productId);
    }
}
