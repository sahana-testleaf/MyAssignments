package class1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]= {2,5,7,7,5,9,2,3};
		//arranges the numbers 
		Arrays.sort(number);
		for (int i = 0; i < number.length-1	; i++) {
			if (number[i]==number[i+1]) {
					System.out.println("the duplicate number is");
					System.out.println(number[i]);
					}
			}
	}
	}



