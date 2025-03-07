package in.codingage.ecommerce.model;

import in.codingage.ecommerce.model.embeddable.Brand;
import in.codingage.ecommerce.model.embeddable.Feature;
import in.codingage.ecommerce.model.embeddable.Offer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("/Product")

public class Product {
    @Id
    private String id;
    private String name;
    private String type;
    private String title;
    private String description;
    private List<String> size;
    private String price;
    private String brand;

    private List<Feature> featureList;
    private List<Offer> offerList;
    private List<Brand> brandList;


    private LocalDate createdDate;
    private LocalDate updatedDate;



}
