package assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class feature4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var path = "C:\\Users\\bonth\\Downloads\\data.txt";
		try {
			String data=Files.readString(Path.of(path));
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
