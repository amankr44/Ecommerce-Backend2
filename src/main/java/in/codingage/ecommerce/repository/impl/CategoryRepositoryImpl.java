package in.codingage.ecommerce.repository.impl;




import in.codingage.ecommerce.model.Category;
import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.CategoryRepository;


import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    List<Category> categoryList = new ArrayList<>();


    public void createCategory(Category category) {
        if(category!=null){
            categoryList.add(category);
        }

    }


    public List<Category> getAllCategory(){
       return categoryList;
    }

    public Category updateCategory(String type, List <Product> productList){
        for(Category category : categoryList){
            if(category.getCategoryType().equals(type)){
                category.setCategoryType(type);
                for(Product product : productList){
                    if(category.getProductList().contains(product)){
                        category.getProductList().remove(product);
                        category.getProductList().add(product);
                    }

                }
                return category;
            }
        }
        return null;
    }

    public Category deleteCategory(String type){
        for(Category category : categoryList){
            if(category.getCategoryType().equals(type)){
                categoryList.remove(categoryList);
                return category;
            }
        }
        return null;
    }


}
