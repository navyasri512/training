package assignments;

public class armstrong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=153,r,sum=0,m;
      int n=num;
      while(n>0){
    	  r=n%10;
    	  m=r*r*r;
    	  sum=sum+m;
    	  n=n/10;
      }
      if(sum == num)
      {
    	  System.out.println(num+" is a armstrong number");
      }
      else{
    	  System.out.println(num+" is not a armstrong number");
      }
	}

}
