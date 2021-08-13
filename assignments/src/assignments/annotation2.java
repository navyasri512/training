package assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@interface info{
	
}
class developer{
	int id;
    String name;
    String supervisor;
    String date;
    String time;
    int version;
    developer(int id,String name,String supervisor,String date,String time,int version){
    	this.id=id;
    	this.name=name;
    	this.supervisor=supervisor;
    	this.date=date;
    	this.time=time;
    	this.version=version;
    }
    void display(){
    	System.out.println("id:"+id+"  "+"name:"+name+"  "+"supervisor:"+supervisor+"  "+"date:"+date+"  "+"time:"+time+"  "+"version:"+version);
    }
}
public class annotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        developer obj=new developer(88,"navya","samrudhi","20-06-21","12:00PM",6);
        obj.display();
	}

}
