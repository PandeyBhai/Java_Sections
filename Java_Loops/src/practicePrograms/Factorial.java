package practicePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int fact = 1;
		
		while(num>=1) {
			fact = fact*num;
			num--;
		}
		System.out.println("Factorial of entered number is: " +fact);

	}

}
