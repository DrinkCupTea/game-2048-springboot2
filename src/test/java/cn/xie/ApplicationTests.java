package cn.xie;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.xie.entity.User;
import cn.xie.mapper.UserMapper;

@SpringBootTest
class ApplicationTests {
	@Resource
	private UserMapper userMapper;

	@Test
	void selectAllUser() {
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
	}

	@Test
	void selectByUsername() {
		User user = userMapper.selectByUsername("xie");
		System.out.println(user.getUsername() + " " + user.getPasswd());
	}

}
