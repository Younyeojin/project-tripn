package shop.tripn.app.demo.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.tripn.app.demo.calculator.entity.Calculator;

@Repository
public interface CalculatorRepository extends MongoRepository<Calculator, Long> {
}
