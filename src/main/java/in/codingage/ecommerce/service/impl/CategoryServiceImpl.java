package in.codingage.ecommerce.service.impl;

import in.codingage.ecommerce.model.Category;

import in.codingage.ecommerce.repository.CategoryRepository;
import in.codingage.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
//    CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
         categoryRepository.save(category);
         return category;
    }

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(String id) {
         categoryRepository.deleteById(id);
    }

    public Optional<Category> getCategoryDetail(String id) {
        return categoryRepository.findById(id);
    }

    public Category findCategoryByType(String categoryType) {
        return categoryRepository.findByCategoryType(categoryType);
    }
}
