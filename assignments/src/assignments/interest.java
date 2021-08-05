package assignments;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p,r,t,s,c,m=0;
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		s=p*r*t;
		int r1=r+1;
		for(int i=1;i<t;i++){
		   m=r1*r1;
		}
		c=(p*m)-p;
		System.out.println("simple interest:"+s);
		System.out.println("compound interest:"+c);

	}

}
