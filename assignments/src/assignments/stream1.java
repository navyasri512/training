package assignments;
import java.util.*;
import java.util.stream.Collectors;
class fruit{
	String name;
	int calories;
	int price;
	String color;
	fruit(String name,int calories,int price,String color){
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	int getprice(){
		return price;
	}
}
public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<fruit> l=new ArrayList<fruit>();
		l.add(new fruit("apple",200,20,"red"));
		l.add(new fruit("orange",100,25,"orange"));
		l.add(new fruit("dragon",50,20,"blue"));
		List<String> l1=l.stream()
				.filter(p -> p.calories<100)
				.map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(l1);

	}

}
