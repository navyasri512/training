package springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class drawing {
	 private static ApplicationContext con;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		con=new ClassPathXmlApplicationContext("spring.xml");
		triangle t=(triangle) con.getBean("shape");
		t.draw();
		

	}

}
