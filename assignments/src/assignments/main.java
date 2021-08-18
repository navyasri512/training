package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	private static ApplicationContext context;
	public static void main(String args[]) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		sayhello hello=(sayhello) context.getBean("Hello");
		hello.hello();
	}

}
