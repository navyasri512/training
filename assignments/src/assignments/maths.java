package assignments;
abstract class shapes{
	abstract void draw();
}
class rectangle extends shapes{
	void draw(){
		System.out.println("rectangle");
	}
}
class circle extends shapes{
	void draw(){
		System.out.println("circle");
	}
}
class square extends shapes{
	void draw(){
		System.out.println("square");
	}
}

public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		circle c= new circle();
		square s= new square();
		r.draw();
		c.draw();
		s.draw();
		

	}

}
