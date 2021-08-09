package assignments;
import java.util.*;
public class exchange {
    public static <T> void swap(T[] arr,int i,int j){
    	T temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr={1,2,3,4,5};
	    Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    int j=sc.nextInt();
        exchange.swap(arr,i,j);
        for(int k=0;k<5;k++){
        	System.out.println(arr[k]);
        }
	}

}
