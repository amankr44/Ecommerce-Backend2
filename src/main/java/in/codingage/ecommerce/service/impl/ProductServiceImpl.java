package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.ProductRepository;
import in.codingage.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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

    public Optional<Product> findProductByName(String name) {
        return Optional.of(productRepository.findByName(name).get());
    }

    @Override
    public List<Product> findAllByCreatedDate(LocalDate createdDate) {
        return productRepository.findAllByCreatedDate(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateAfter(LocalDate createdDate) {
        return productRepository.findAllByCreatedDateAfter(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateBefore(LocalDate createdDate) {
        return productRepository.findAllByCreatedDateBefore(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateGreaterThan(LocalDate createdDate) {
        return productRepository.findAllByCreatedDateGreaterThan(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateGreaterThanEqual(LocalDate createdDate) {
        return productRepository.findAllByCreatedDateGreaterThanEqual(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateLessThanEqual(LocalDate createdDate) {
        return productRepository.findAllByCreatedDateLessThanEqual(createdDate);
    }

    @Override
    public List<Product> findAllByCreatedDateBetween(LocalDate fromDate, LocalDate toDate) {
        return productRepository.findAllByCreatedDateBetween(fromDate,toDate);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(String price) {
        return productRepository.findAllByPriceGreaterThan(price);
    }

    // not work
    @Override
    public Optional<Product> findByNameAndType(String name, String title) {
        return productRepository.findByNameAndType(name,title);
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return productRepository.findByNameContaining(name);
    }

    @Override
    public List<Product> findByNameStartingWith(String name) {
        return productRepository.findByNameStartingWith(name);
    }

    @Override
    public boolean existsByName(String name) {
        return productRepository.existsByName(name);
    }

    @Override
    public List<Product> findBySizeIn(String size) {
        return productRepository.findBySizeIn(size);
    }

    @Override
    public List<Product> findBySizesIn(List<String> size) {
        return productRepository.findBySizeIn(size);
    }


}
