package shop.tripn.app.demo.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.tripn.app.demo.calculator.entity.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
}
