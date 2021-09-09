package test;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired private UserDao userDao;
	
	@Test
	void test() {
		var list = Arrays.asList(
			User.builder().name("ant").passwd("111").age(10).build(),
			User.builder().name("bear").passwd("222").age(20).build(),
			User.builder().name("cat").passwd("333").age(18).build()
		);
		userDao.saveAll(list);
		System.out.println("----- select where age -----");
		userDao.findByAgeBetween(15, 20).forEach(System.out::println);
		System.out.println("----- update -----");
		var user = userDao.findByNameAndPasswd("bear", "222");
		if(user != null) {
			user.setPasswd("555555");
			user.setAge(888);
			userDao.save(user);
		}
		System.out.println("----- select all -----");
		userDao.findAll().forEach(System.out::println);
		System.out.println("----- delete all -----");
		userDao.deleteAll();
	}

}
