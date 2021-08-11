package shop.tripn.app.demo.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.tripn.app.demo.user.entity.User;
import shop.tripn.app.demo.user.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
