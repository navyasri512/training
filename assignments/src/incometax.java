import java.util.*;
public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long income=sc.nextLong();
		long tax=0;
		if(income>0 && income<=180000){
			System.out.println(tax);
		}
		else if(income>180001 && income<=300000){
			tax=income/10;
			System.out.println(tax);
		}
		else if(income>300001 && income<=500000){
			tax=2*(income/10);
			System.out.println(tax);
		}
		else if(income>500001 && income<=1000000){
			tax=3*(income/10);
			System.out.println(tax);
		}
		

	}

}
