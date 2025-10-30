package class1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sahana";
		char[] name1 = name.toCharArray();
		System.out.println(name1);
		for (int i=name1.length-1; i>=0; i--) {
			System.out.print(name1[i]);
		}
	}

}
