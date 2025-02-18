package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Category;

import in.codingage.ecommerce.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

//    CategoryServiceImpl categoryService = new CategoryServiceImpl();
    @Autowired
    private CategoryServiceImpl categoryService;


    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/categoryDetail")
    public Category getCategoryDetail(@RequestParam int categoryId){
        return categoryService.getCategoryDetail(categoryId);
    }

    @PutMapping
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping
    public boolean deleteCategory(@RequestParam int categoryId){
        return categoryService.deleteCategory(categoryId);
    }
}
