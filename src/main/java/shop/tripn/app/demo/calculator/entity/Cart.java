package shop.tripn.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "carts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private @Id long cartId;
    private List<Item> cartItems;

}
