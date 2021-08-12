package assignments;
import java.util.*;
class contact{
	long phno;
	String name;
	String email;
	
	enum gender{male,female}
	gender g;
	contact(long phno,String name,String email,gender g){
		this.phno=phno;
		this.name=name;
		this.email=email;
		this.g=g;
	}
	public String toString(){
		return "phonenumber:"+phno+"  "+"name:"+name+"  "+"email:"+email+"  "+"gender:"+g;
	}
}
public class collect1 {

	public static <var> void main(String[] args) {
		// TODO Auto-generated method stub
		class descphone implements Comparator<Long>{
			public int compare(Long o1,Long o2){
				return (int)(o2-o1);
			}
		}
		TreeMap<Long,contact> c=new TreeMap<>(new descphone());
		contact c1=new contact(96526064,"navya","navyasri@gmail.com",contact.gender.female);
		contact c2=new contact(96526088,"viswani","viswani@gmail.com",contact.gender.female);
		contact c3=new contact(96526054,"sai","sai@gmail.com",contact.gender.male);
		c.put(c1.phno, c1);
		c.put(c2.phno, c2);
		c.put(c3.phno, c3);
		Set<Long> k=c.keySet();
		System.out.println(k);
		
		System.out.println(c.values());
		System.out.println(c);


	}

}
