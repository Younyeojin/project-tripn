package shop.tripn.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private Item item;
    private int quantity;
}
