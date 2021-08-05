import java.util.*;

public class supplymarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sub1=s.nextInt();
		int sub2=s.nextInt();
		int sub3=s.nextInt();
		if(sub1>60 && sub2>60 && sub3>60){
			System.out.println("Passed");
		}
		else if((sub1>60 && sub2>60) || (sub1>60 && sub3>60) || (sub2>60 && sub3>60)){
			System.out.println("promoted");
		}
		else if(sub1<60 || sub2<60 || sub3<60 ){
			System.out.println("failed");
		}

	}

}
