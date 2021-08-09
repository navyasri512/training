package assignments;

import java.util.Scanner;

abstract class persistence{
	abstract void persist();
}
class filepersistence extends persistence{
	void persist(){
		System.out.println("file persistence");
	}
}
class databasepersistence extends persistence{
	void persist(){
		System.out.println("database persistence");
	}
}
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("data is saved in(select either file or database):");
		String s=sc.nextLine();
		filepersistence f=new filepersistence();
		databasepersistence d=new databasepersistence();
		if(s.contentEquals("file")){
			f.persist();
		}
		else{
			d.persist();
		}

	}

}
