package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public Optional<Product> findProductByName(@RequestParam String name){
        return productService.findProductByName(name);
    }

    @GetMapping("/date")
    public List<Product> findAllByCreatedDate(@RequestParam  LocalDate createdDate){
        return productService.findAllByCreatedDate(createdDate);
    }

    @GetMapping("/dateAfter")
    public List<Product> findAllByCreatedDateAfter(@RequestParam LocalDate createdDate){
        return productService.findAllByCreatedDateAfter(createdDate);
    }

    @GetMapping("/dateBefore")
    public List<Product> findAllByCreatedDateBefore(@RequestParam LocalDate createdDate){
        return productService.findAllByCreatedDateBefore(createdDate);
    }

    @GetMapping("/dateGreaterThan")
    public List<Product> findAllByCreatedDateGreaterThan(@RequestParam LocalDate createdDate){
        return productService.findAllByCreatedDateGreaterThan(createdDate);
    }

    @GetMapping("/dateGreaterThanEqual")
    public List<Product> findAllByCreatedDateGreaterThanEqual(@RequestParam LocalDate createdDate){
        return productService.findAllByCreatedDateGreaterThanEqual(createdDate);
    }

    @GetMapping("/dateLessThanEqual")
    public List<Product> findAllByCreatedDateLessThanEqual(@RequestParam LocalDate createdDate){
        return productService.findAllByCreatedDateLessThanEqual(createdDate);
    }

    @GetMapping("/dateBetween")
    public List<Product> findAllByCreatedDateBetween(@RequestParam LocalDate fromDate, LocalDate toDate){
        return productService.findAllByCreatedDateBetween(fromDate,toDate);
    }

    @GetMapping("/priceGreaterThan")
    public List<Product> findAllByPriceGreaterThan(@RequestParam String price){
        return productService.findAllByPriceGreaterThan(price);
    }

    // not work
    @GetMapping("/nameAndTitle")
    public Optional<Product> findByNameAndType(@RequestParam String name,String title){
        return productService.findByNameAndType(name,title);
    }

    @GetMapping("/nameContaining")
    public List<Product> findByNameContaining(@RequestParam String name){
        return productService.findByNameContaining(name);
    }

    @GetMapping("/nameStarting")
    public List<Product> findByNameStartingWith(@RequestParam String name){
        return productService.findByNameStartingWith(name);
    }

    @GetMapping("/existsByName")
    public boolean existsByName(@RequestParam String name){
        return productService.existsByName(name);
    }

    @GetMapping("/sizeIn")
    public List<Product> findBySizeIn(@RequestParam String size){
        return productService.findBySizeIn(size);
    }

    @GetMapping("/sizeInTwo")
    public List<Product> findBySizesIn(@RequestParam List<String> size){
        return productService.findBySizesIn(size);
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
