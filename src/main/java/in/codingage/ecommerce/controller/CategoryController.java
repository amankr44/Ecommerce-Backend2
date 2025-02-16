package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Category;
import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    CategoryServiceImpl categoryService = new CategoryServiceImpl();


    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    public Category updateCategory(String type, List<Product> productList){
        return categoryService.updateCategory(type,productList);
    }

    public Category deleteCategory(String type){
        return categoryService.deleteCategory(type);
    }
}
