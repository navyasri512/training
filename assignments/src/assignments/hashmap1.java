package assignments;

import java.util.*;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,Double> test=new HashMap<>();
      test.put(1, 1.0);
      test.put(2, 2.0);
      test.put(3, 3.0);
      test.put(4, 4.0);
      test.put(5, 5.0);
      test.put(6, 6.0);
      test.put(7, 7.0);
      test.put(8, 8.0);
      test.put(9, 9.0);
      test.put(10, 20.0);
      Set<Map.Entry<Integer, Double>> entries = test.entrySet();

      for (Map.Entry<Integer, Double> entry : entries) {
      System.out.print("key: "+ entry.getKey());
      System.out.println(", Value: "+ entry.getValue());
      }
	}

}
