package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Category;

import in.codingage.ecommerce.repository.impl.CategoryRepositoryImpl;
import in.codingage.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
//    CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    @Autowired
    CategoryRepositoryImpl categoryRepository;

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

    public Category getCategoryDetail(int categoryId) {
        return categoryRepository.getCategoryDetail(categoryId);
    }
}
