package assignments;

import java.util.Scanner;

class employee{
	int salary(int s,int t,int i){
		return 0;
	}
}
class manager extends employee{
	public int epay=1000;
	int salary(int s,int t,int i){
	int total=s+i;
	System.out.println("manager salary:"+total);
	return total;
	}
}
class labour extends employee{
	public int epay=1000;
	int salary(int s,int t,int i){
	int tu=s+(t*epay);
	System.out.println("labour salary:"+tu);
	return tu;
	}
}
public class totalsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       manager m=new manager();
       labour l=new labour();
       int s=sc.nextInt();
       int t=sc.nextInt();
       int i=sc.nextInt();
       int sum=m.salary(s,t,i)+l.salary(s, t, i);
       System.out.println("total salary:"+sum);
	}

}
