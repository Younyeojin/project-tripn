package shop.tripn.app.demo.calculator.service;

import org.springframework.stereotype.Component;
import shop.tripn.app.demo.calculator.entity.Item;
import shop.tripn.app.demo.calculator.entity.User;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByItemName(String itemName);
    Optional<Item> findById(long itemId);
}
