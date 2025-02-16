package in.codingage.ecommerce.repository;

import in.codingage.ecommerce.model.Category;
import in.codingage.ecommerce.model.Product;


import java.util.List;

public interface CategoryRepository {

    public void createCategory(Category category);

     List<Category> getAllCategory();

    public Category updateCategory(String type, List <Product> productList);

    public Category deleteCategory(String type);
}
