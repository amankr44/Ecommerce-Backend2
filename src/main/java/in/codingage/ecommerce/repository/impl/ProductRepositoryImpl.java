package in.codingage.ecommerce.repository.impl;

import in.codingage.ecommerce.model.Product;
import in.codingage.ecommerce.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> productList = new ArrayList<>();

    public void createProduct(Product product) {
        if(product != null){
            productList.add(product);
        }


    }

    public List<Product> getAllProduct() {
        return productList;
    }


    public Product updateProduct(Product product) {
        for(Product product1 : productList){
            if(product1.getProductId()== product.getProductId()){
                product1.setPrice(product.getPrice());
                product1.setBrand(product.getBrand());
                product1.setSpecialFeature(product.getSpecialFeature());
                product1.setOffers(product.getOffers());
                return product;
            }
        }
        return null;
    }

    public boolean deleteProduct(int productId) {
        for(Product product : productList){
            if(product.getProductId()==productId){
                productList.remove(product);
                return true;
            }

        }
        return false;

    }
}
