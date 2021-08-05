package assignments;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=0;
		int s=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i] == s){
				k=1;
			}
			
		}
		if(k==0){
			System.out.println(s+" is not found");
		}
		else{
			System.out.println(s+" is found");
		}

	}

}
