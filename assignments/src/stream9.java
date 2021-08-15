package assignments;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;
class DistinctCustomPropertyExample {
    public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor){
   	 Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
   	 return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
public class stream9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trader> l=new ArrayList<Trader>();
		l.add(new Trader("navya","eluru"));
		l.add(new Trader("viswani","ongole"));
		l.add(new Trader("sai","guntur"));
		
		List<Trader> l1=l.stream()
				.filter(DistinctCustomPropertyExample.distinctByKey(p -> p.getcity()))
				.collect(Collectors.toList());
		System.out.println(l1);
				
				

	}

}
