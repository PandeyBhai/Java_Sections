package practicePrograms;

import java.util.Scanner;

public class CheckPalindromStringOrNumber {

	static boolean checkPalindromeway2(String orginalString) {
		String reverseString = "";
		for(int i=orginalString.length()-1;i>=0;i--) {
			reverseString = reverseString + orginalString.charAt(i);
		}
		if(reverseString.equals(orginalString)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string or number to be checked for palindrome");
		if(checkPalindromeway2(input.nextLine())) {
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("It's Not Palindrome");
		}

	}

}