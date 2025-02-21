package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Category;



import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category createCategory(Category category );

    List<Category> getAllCategory();

    Category updateCategory(Category category);

   void deleteCategory(String id);

    public Optional<Category> getCategoryDetail(String id);

    public Category findCategoryByType(String categoryType);
}

