package assignments;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
public class stream3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<fruit> l1=new ArrayList<fruit>();
		l1.add(new fruit("apple",200,20,"red"));
		l1.add(new fruit("orange",100,25,"orange"));
		l1.add(new fruit("dragon",50,20,"blue"));
		List<String> l=l1.stream()
				.filter(p ->p.color=="red")
				.sorted(Comparator.comparing(fruit::getprice))
				.map(p->p.name)
				.collect(Collectors.toList());
		l.forEach(System.out::println);

	}

}
