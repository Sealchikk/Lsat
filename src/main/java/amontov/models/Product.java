package amontov.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name can't be blank")
    private String name;
    @NotBlank(message = "category can't be blank")
    private String category;
    @NotBlank(message = "price can't be blank")
    private double price;
    @NotBlank(message = "quantity can't be blank")
    private int quantity;
    @NotBlank(message = "weight can't be blank")
    private String weight;
    @NotBlank(message = "manufacture can't be blank")
    private String manufacture;
}
