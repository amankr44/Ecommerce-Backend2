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
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Product")

public class Product {
    @Id
    private String id;
    private String name;
    private List<String> size;
    private String price;
    private String brand;

    private List<Feature> featureList;
    private List<Offer> offerList;
    private List<Brand> brandList;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedDate;



}
