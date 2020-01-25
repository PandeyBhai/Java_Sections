package if_Else_switch;

import java.util.Scanner;

public class Quadratic_Eq_Roots {

	public static void main(String[] args) {
		double root1 = 0;
		// TODO Auto-generated method stub
		double root2=0;
		int a, b, c;
		
		System.out.println("A quadratic equation is of the form ax^2+bx+c");
		System.out.println("Enter values for a, b and c");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a");
		a=input.nextInt();
		
		System.out.println("Enter b");
		b=input.nextInt();
		
		System.out.println("Enter c");
		c=input.nextInt();
		
		if(a!=0) {
			if((b*b)>=(4*a*c)) {
				root1 = ((-b + (Math.sqrt((b*b)-4*a*c)))/(2*a));
				root2 = ((-b - (Math.sqrt((b*b)-4*a*c)))/(2*a));				
				System.out.println("Roots of the quadratic equation are " +root1+ " and " +root2);

			}
			else {
				System.out.println("Not possible to calculate roots");
			}
		}
		
		else {
			System.out.println("Not a quadratic equation");
		}
	}

}