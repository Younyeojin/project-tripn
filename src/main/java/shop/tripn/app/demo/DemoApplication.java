package shop.tripn.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.tripn.app.demo.user.entity.User;
import shop.tripn.app.demo.user.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		userRepository.deleteAll();
		userRepository.save(new User("a","윤여진","a@","1"));
		userRepository.save(new User("b","윤여진","b@","1"));
		userRepository.save(new User("c","여진","c@","1"));
		List<User> users = userRepository.findAll();
		System.out.println("전체를 출력 하시오");
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println("여진만 출력 하시오");
		for(User u: userRepository.findAllByName("홍길동")){
			System.out.println(u.toString());
		}
	}
}
