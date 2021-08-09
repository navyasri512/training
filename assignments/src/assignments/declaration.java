package assignments;
abstract class hello{
	abstract void message();
}
class helloworld extends hello{
	public void message(){
		System.out.println("abstract class");
	}
}
public class declaration{
	public static void main(String args[]){
		helloworld h=new helloworld();
		h.message();
	}
}