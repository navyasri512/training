
public class armstrongrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=100;i<=999;i++){
    	   int n=i,r,sum=0,m;
    	   while(n>0){
    		   r=n%10;
    	       m=r*r*r;
    	       sum=sum+m;
    	       n=n/10;
    	   }
    	   if(sum == i)
    	   {
    	      System.out.println(i+" ");
    	   }
       }
	}

}
