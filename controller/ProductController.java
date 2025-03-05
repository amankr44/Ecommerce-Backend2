package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
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

    @GetMapping("/name")
    public Product findByName(@RequestParam String name){
        return productService.findByName(name);
    }

    @GetMapping("/date")
    public List<Product> findAllByCreatedDate(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        return productService.findAllByCreatedDate(date);
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
