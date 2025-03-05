package in.codingage.ecommerce.controller;

import in.codingage.ecommerce.model.Category;

import in.codingage.ecommerce.service.CategoryService;
import in.codingage.ecommerce.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {


    @Autowired
//    private CategoryServiceImpl categoryService;
    private CategoryService categoryService;


    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/categoryDetail")
    public Optional<Category> getCategoryDetail(@RequestParam String id){
        return categoryService.getCategoryDetail(id);
    }

    @GetMapping("/categoryType")
    public Category findCategoryByType(@RequestParam String categoryType){
        return categoryService.findCategoryByType(categoryType);
    }

    @PutMapping
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping
    public void deleteCategory(@RequestParam String id){
        categoryService.deleteCategory(id);
    }
}
