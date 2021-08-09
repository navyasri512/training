package assignments;

public class bufferreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("it is used to _ at the specified index position");
		sb.replace(14, 16, "insert text ");
		System.out.println(sb);
	}

}
