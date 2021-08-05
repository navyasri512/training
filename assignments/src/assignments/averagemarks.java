package assignments;

import java.util.Scanner;

public class averagemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int s1[]=new int[3];
       int s2[]=new int[3];
       int s3[]=new int[3];
       int sum1=0,sum2=0,sum3=0,avg1,avg2,avg3,sums1=0,sums2=0,sums3=0;
       for(int i=0;i<3;i++){
    	   s1[i]=sc.nextInt();
    	   sum1=sum1+s1[i];
       }
       avg1=sum1/3;
       for(int i=0;i<3;i++){
    	   s2[i]=sc.nextInt();
    	   sum2=sum2+s2[i];
       }
       avg2=sum2/3;
       for(int i=0;i<3;i++){
    	   s3[i]=sc.nextInt();
    	   sum3=sum3+s3[i];
       }
       avg3=sum3/3;
       for(int i=0;i<3;i++){
    	   sums1=sums1+s1[i];
    	   sums2=sums2+s2[i];
    	   sums3=sums3+s3[i];
       }
       int avgs1=sums1/3;
       int avgs2=sums2/3;
       int avgs3=sums3/3;
       System.out.println("total and average of subjects of each students:"+sum1+" "+sum2+" "+sum3+" "+avg1+" "+avg2+" "+avg3);
       System.out.println("total and average of students in each subject:"+sums1+" "+sums2+" "+sums3+" "+avgs1+" "+avgs2+" "+avgs3);
       
	}

}
