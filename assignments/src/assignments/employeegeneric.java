package assignments;
import java.util.*;
public class employeegeneric {
	
    private int id;
    private String name;
    private int salary;
    private String dept;
    employeegeneric(int id,String name,int salary,String dept){
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	this.dept=dept;
    }
    public void displayDetails(){
    	System.out.println(this);
    }
    public String toString(){
    	return "id:"+id+" "+"name:"+name+" "+"salary:"+salary+" "+"department:"+dept+"\n";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<employeegeneric> employee=new HashSet<>();
      employee.add(new employeegeneric(10,"navya",10000,"cse"));
      employee.add(new employeegeneric(11,"viswani",1000,"it"));
      employee.add(new employeegeneric(10,"sai",20000,"ece"));
      System.out.println(employee);
	}

}
