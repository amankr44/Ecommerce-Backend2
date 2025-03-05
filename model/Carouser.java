package in.codingage.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("/Carouser")
public class Carouser {
    @Id
    private String id;
    private String header;
    private String subHeader;
    private String backGroundUrl;


}
