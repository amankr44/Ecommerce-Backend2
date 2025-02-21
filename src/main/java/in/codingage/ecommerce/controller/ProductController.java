package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

//    ProductServiceImpl productService = new ProductServiceImpl();

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/productDetail")
    public Optional<Product> getProductDetail(@RequestParam String id){
        return productService.getProductDetail(id);
    }

    @GetMapping("/title")
    public Product findByTitle(@RequestParam String title){
        return productService.findByTitle(title);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }


    @DeleteMapping
    public void deleteProduct(@RequestParam String id){
         productService.deleteProduct(id);
    }
}
