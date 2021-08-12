package assignments;
import java.util.*;
public class collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
