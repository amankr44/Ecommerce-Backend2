package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Category;



import java.util.List;

public interface CategoryService {
    Category createCategory(Category category );

    List<Category> getAllCategory();

    Category updateCategory(Category category);

    boolean deleteCategory(int categoryId);
}
