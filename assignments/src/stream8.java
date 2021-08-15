package assignments;
import java.util.*;
import java.util.stream.Collectors;
class Trader{
	String name;
	String city;
	Trader(String name,String city){
		this.name=name;
		this.city=city;
	}
	String getcity() {
		return city;
	}
	public String toString() {
		return "name:"+name+"city:"+city;
	}
}
class Transaction{
	Trader trader;
	int year;
	int value;
	Transaction(Trader trader,int year,int value){
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	int getvalue() {
		return value;
	}
	public String toString() {
		return "name:"+trader.name+"city:"+trader.city+"year:"+year+"value:"+value;
	}
}
public class stream8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader o=new Trader("navya","eluru");
		Trader o1=new Trader("viswani","ongole");
		Trader o2=new Trader("sai","guntur");
		
		List<Transaction> l=new ArrayList<Transaction>();
		l.add(new Transaction(o,2011,123));
		l.add(new Transaction(o1,2011,154));
		l.add(new Transaction(o2,2010,100));
		
		List<Transaction> l1=l.stream()
				.filter(p -> p.year==2011)
				.sorted(Comparator.comparing(Transaction::getvalue))
				.collect(Collectors.toList());
		System.out.println(l1);
		

	}

}
