package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Category;



import java.util.List;

public interface CategoryRepository {

    public void createCategory(Category category);

     List<Category> getAllCategory();

    public Category updateCategory(Category category);

    public boolean deleteCategory(int categoryId);

    public Category getCategoryDetail(int categoryId);
}
