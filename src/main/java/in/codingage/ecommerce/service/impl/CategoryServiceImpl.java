package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Category;

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

    public Category updateCategory(Category category) {
        return categoryRepository.updateCategory(category);
    }

    public boolean deleteCategory(int categoryId) {
        return categoryRepository.deleteCategory(categoryId);
    }

}
