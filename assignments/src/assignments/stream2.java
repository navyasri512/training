package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<fruit> l=new ArrayList<fruit>();
		l.add(new fruit("apple",200,20,"red"));
		l.add(new fruit("orange",100,25,"orange"));
		l.add(new fruit("dragon",50,20,"blue"));
		List<String> l1=l.stream()
				.sorted((p1,p2) -> p1.color.compareTo(p2.color))
				.map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(l1);
		

	}

}
