package in.codingage.ecommerce.repository.impl;




import in.codingage.ecommerce.model.Category;

import in.codingage.ecommerce.repository.CategoryRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
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

    public Category updateCategory(Category category){
        for(Category category1 : categoryList){
            if(category1.getCategoryId()==category.getCategoryId()){
                category1.setCategoryType(category.getCategoryType());
                category1.setProductList(category.getProductList());
                return category;
            }
        }
        return null;
    }

    public boolean deleteCategory(int categoryId){
        for(Category category : categoryList){
            if(category.getCategoryId()==categoryId){
                categoryList.remove(categoryList);
                return true;
            }
        }
        return false;
    }


}
