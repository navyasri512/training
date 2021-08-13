package assignments;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
  
}
class example{
	int r;
	@Test
	public void testcase(int r){
		System.out.println(r);
	}
}
public class annotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	  example obj=new example();
    	  obj.testcase(10);
       
	}
}
