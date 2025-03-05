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
@Document("/User")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String MobNo;
    private String email;
    private String password;



}
