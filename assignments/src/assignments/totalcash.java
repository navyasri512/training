package assignments;

import java.util.Scanner;

class bank1{
	public int amount(int a){
		return 0;
	}
}
class savings1 extends bank1{
	int a;
	public int amount(int a){
		this.a=a;
		return a;
	}
}
class current1 extends bank1{
	int a;
	public int amount(int a){
		this.a=a;
		return a;
	}
}

public class totalcash {
  public static void main(String args[]){
	  savings1 s=new savings1();
	  current1 c=new current1();
	  Scanner sc=new Scanner(System.in);
	  int save=sc.nextInt();
	  int cur=sc.nextInt();
	  int sum=s.amount(save)+c.amount(cur);
	  System.out.println("total cash in bank:"+sum);
  }
}
