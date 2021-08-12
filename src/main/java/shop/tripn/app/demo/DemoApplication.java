package shop.tripn.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import shop.tripn.app.demo.calculator.entity.Item;
import shop.tripn.app.demo.calculator.entity.User;
import shop.tripn.app.demo.calculator.repository.ItemRepository;
import shop.tripn.app.demo.calculator.repository.UserRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ItemRepository itemRepository;
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("######## Application Beginning ########");
		userRepository.deleteAll();
  		userRepository.save(new User(1,"a","윤여진","a@","1",new Date()));
  		userRepository.save(new User(2,"b","윤여진","b@","1",new Date()));
  		userRepository.save(new User(3,"c","여진","c@","1",new Date()));
  		List<User> users = userRepository.findAll();
  		System.out.println("전체를 출력 하시오");
  		for(User u: users){
  			System.out.println(u.toString());
         }System.out.println("여진만 출력 하시오");
  		for(User u: userRepository.findAllByName("여진")){
  			System.out.println(u.toString());
         }
		itemRepository.deleteAll();
		itemRepository.save(new Item(1, "갤럭시Z", 200, "신제품", new Date()));
		itemRepository.save(new Item(2, "노트북", 150, "지문인식", new Date()));
		itemRepository.save(new Item(3, "데스크탑", 100, "게이밍", new Date()));
		List<Item> items = itemRepository.findAll();
		System.out.println("Print All Items");
		for (Item u : items){
			System.out.println(u.toString());
		}
	}
}

/**	@Autowired
private UserRepository userRepository;
 * @Override
 *        public void run(String...args) throws Exception{
 * 		userRepository.deleteAll();
 * 		userRepository.save(new User("a","윤여진","a@","1"));
 * 		userRepository.save(new User("b","윤여진","b@","1"));
 * 		userRepository.save(new User("c","여진","c@","1"));
 * 		List<User> users = userRepository.findAll();
 * 		System.out.println("전체를 출력 하시오");
 * 		for(User u: users){
 * 			System.out.println(u.toString());
 *        }
 * 		System.out.println("여진만 출력 하시오");
 * 		for(User u: userRepository.findAllByName("여진")){
 * 			System.out.println(u.toString());
 *        }*/
