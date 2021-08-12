package shop.tripn.app.demo.calculator.service;

import org.springframework.stereotype.Component;
import shop.tripn.app.demo.calculator.entity.User;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();
    List<User> findAllByName(String name);
    Optional<User> findById(long id);
}
