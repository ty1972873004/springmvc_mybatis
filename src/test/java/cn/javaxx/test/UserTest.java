package cn.javaxx.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javaxxw.model.User;
import cn.javaxxw.service.UserService;


///** 声明用的是Spring的测试类 **/
//@RunWith(SpringJUnit4ClassRunner.class)
///** 声明spring主配置文件位置，注意：以当前测试类的位置为基准,有多个配置文件以字符数组声明 **/
//@ContextConfiguration(locations = { "classpath:applicationContext-jdbc.xml", "classpath:applicationContext-mybatis.xml" })  

public class UserTest {
	
		
		private UserService userService;
		
		@Before
	    public void before(){                                                                   
	        @SuppressWarnings("resource")
	        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"
	                ,"classpath:applicationContext-mybatis.xml"});
	        userService = (UserService) context.getBean("userService");
	    }
		
		//@Test
	    public void addUser(){
	        System.out.println(userService.addUser("tuyong", "trazen", "1", 18));
	    }
	    
	    @Test
		public void getAll(){
			List<User> list = userService.getAll();
			for( User user : list){
				System.out.println(user.getId()+user.getNickName());
			}
		}
	

}
