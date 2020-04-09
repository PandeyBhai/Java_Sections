package practicePrograms;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns you want to have in Array 1");
		int[][] arr_A = new int[input.nextInt()][input.nextInt()];
		
		System.out.println("Enter the number of rows and columns you want to have in Array 2");
		int[][] arr_B = new int[input.nextInt()][input.nextInt()];
		
		System.out.println(arr_A.length);
		System.out.println(arr_B.length);
		
		System.out.println("Enter Array 1 elements");
		for(int i=0;i<arr_A.length;i++) {
			for(int j=0;j<arr_A.length;j++) {
				arr_A[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter Array 2 elements");
		for(int i=0;i<arr_B.length;i++) {
			for(int j=0;j<arr_B.length;j++) {
				arr_B[i][j] = input.nextInt();
			}
		}
		
		int[][] arr_C = new int[arr_A.length][arr_B.length];
		
		for(int i=0;i<arr_A.length;i++) {
			for(int j=0;j<arr_B.length;j++) {
				arr_C[i][j]=0;
				for(int k=0;k<arr_C.length;k++) {
					arr_C[i][j] = arr_A[i][k]*arr_B[k][j];
				}
				System.out.print(arr_C[i][j]+" ");
			}
			System.out.println();
		}

	}

}
