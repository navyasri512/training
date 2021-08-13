package assignments;
import java.util.*;
import java.util.function.UnaryOperator;

class lambda61 implements UnaryOperator<String> {
	public String apply(String str) {
	      return str.toLowerCase();
	   }

}
public class lambda6{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;

		
		ArrayList<String> arrlist
			= new ArrayList<String>(n);

		arrlist.add("NAVYA");
       	arrlist.add("SAI");
        arrlist.add("VISWANI");
     	arrlist.add("DEVI");
        arrlist.add("JANU");
      	
      	System.out.println(arrlist);
  		arrlist.replaceAll(new lambda61());
		
       
		for (int i = 0; i < arrlist.size(); i++)
			System.out.print(arrlist.get(i) + " ");
	}
	
}

