package assignments;
import java.util.*;
import java.util.function.Consumer;
public class lambda5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<StringBuilder>  PrintFirstLetter = (item->{
            System.out.print(item.charAt(0));
        });


		List<StringBuilder> list= new LinkedList<>();
        list.add(new StringBuilder("navya"));
        list.add(new StringBuilder("sai"));
        list.add(new StringBuilder("viswani"));
        list.add(new StringBuilder("hello"));
        
        list.forEach(PrintFirstLetter);
		

	}

}
