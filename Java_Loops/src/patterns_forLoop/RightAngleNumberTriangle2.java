package patterns_forLoop;

public class RightAngleNumberTriangle2 {

//						1
//					1	2
//				1	2	3
//			1	2	3	4	
//		1	2	3	4	5
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++){
			for(int j=(5-i);j>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
