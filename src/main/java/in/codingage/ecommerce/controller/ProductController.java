package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    ProductServiceImpl productService = new ProductServiceImpl();


    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }


    @DeleteMapping
    public boolean deleteProduct(@RequestParam int productId){
        return productService.deleteProduct(productId);
    }
}
