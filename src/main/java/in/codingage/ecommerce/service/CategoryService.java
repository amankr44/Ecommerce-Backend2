package in.codingage.ecommerce.service;

import in.codingage.ecommerce.model.Category;
import in.codingage.ecommerce.model.Product;


import java.util.List;

public interface CategoryService {
    Category createCategory(Category category );

    List<Category> getAllCategory();

    Category updateCategory(String type, List <Product> productList);

    Category deleteCategory(String type);
}
