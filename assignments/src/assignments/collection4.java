package assignments;
import java.time.LocalDate;
import java.util.*;
public class collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1=LocalDate.of(2000, 12, 1);
		LocalDate d2=LocalDate.of(1999, 8, 28);
		LocalDate d3=LocalDate.of(1998, 7, 3);
		LocalDate d4=LocalDate.of(1996, 12, 4);
		List<LocalDate> dob=new LinkedList<LocalDate>();
		dob.add(d1);
		dob.add(d2);
		dob.add(d3);
		dob.add(d4);
		System.out.println(dob);
		for(LocalDate b:dob){
			boolean s=true;
			boolean y=b.isLeapYear();
			if(s == y){
				System.out.println(b.getYear()+"is a leap year");
			}
			else{
				System.out.println(b.getYear()+"is not a leap year");
			}
		}
		
		
		

	}

}
