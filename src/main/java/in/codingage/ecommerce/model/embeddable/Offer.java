package in.codingage.ecommerce.model.embeddable;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Offer {
    private String name;
    private double discountPercentage;
    private Date expiryDate;
    private boolean active;
}
