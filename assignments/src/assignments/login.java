package assignments;
import java.util.*;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1,i=0;
		while(i<3){
			Scanner sc=new Scanner(System.in);
			String user,pw;
			System.out.println("enter username:");
			user=sc.nextLine();
			System.out.println("enter password:");
			pw=sc.nextLine();
			if(user.equals("navya") && (pw.equals("7555"))){
				System.out.println("welcome");
				break;
			}
			if((user!=("navya") && pw!=("7555")) || (user.equals("navya") && pw!=("7555")) ){
			  System.out.println("invalid username");
			  c++;
			}
			if(c>3){
				System.out.println("3 incorrect inputs");
				System.exit(0);
			}
			
		}

	}

}
