package stringPractice;

import java.util.Scanner;

public class SwapWithoutAnotherVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String s1 = new String(input.nextLine());
		
		System.out.println("Enter 2nd String");
		String s2 = new String(input.nextLine());
		
		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
