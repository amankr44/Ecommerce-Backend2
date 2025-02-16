package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Category;
import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.impl.CategoryRepositoryImpl;
import in.codingage.ecommerce.service.CategoryService;


import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    public Category createCategory(Category category) {
         categoryRepository.createCategory(category);
         return category;
    }

    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    public Category updateCategory(String type, List<Product> productList) {
        return categoryRepository.updateCategory(type, productList);
    }

    public Category deleteCategory(String type) {
        return categoryRepository.deleteCategory(type);
    }

}
