package assignments;
import java.util.*;
public class lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList();
		l.add("navya");
		l.add("viswani");
		l.add("sai");
		l.add("haha");
		l.removeIf(n -> n.length()%2!=0);
		System.out.println(l);
		

	}

}
