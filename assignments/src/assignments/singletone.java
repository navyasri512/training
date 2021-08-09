package assignments;

final class question
{
	public void show()
	{
		System.out.println("hello");
	}
}
class A extends question
{
	public void show()
	{
		System.out.println("hi");
	}
}
public class singletone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show();

	}

}
