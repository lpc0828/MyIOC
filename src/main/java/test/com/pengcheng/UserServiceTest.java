package test.com.pengcheng;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pengcheng.model.User;
import com.pengcheng.service.UserService;

public class UserServiceTest {

	@Test
	public void test() throws Exception {
		BeanFactory fy = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService) fy.getBean("userService");
		User user = new User();
		service.addUser(user);
	}
}
