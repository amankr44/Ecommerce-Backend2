package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.ProductRepository;
import in.codingage.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

//    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
         productRepository.save(product);
         return product;

    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
         productRepository.deleteById(id);
    }

    public Optional<Product> getProductDetail(String id) {
        return productRepository.findById(id);
    }

    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findAllByCreatedDate(Date date) {
        return productRepository.findAllByCreatedDate(date);
    }
}
