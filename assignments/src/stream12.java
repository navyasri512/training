package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trader> l=new ArrayList<Trader>();
		l.add(new Trader("navya","pune"));
		l.add(new Trader("viswani","indore"));
		l.add(new Trader("sai","guntur"));
		List<Trader> l1=l.stream()
				.filter(p-> p.city=="indore")
				.collect(Collectors.toList());
		System.out.println(l1);


	}

}
