package cn.xie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.xie.dao.UserDao;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		System.out.println("TEST");
		System.out.println(userDao.getByUsername("xie"));
	}

}
