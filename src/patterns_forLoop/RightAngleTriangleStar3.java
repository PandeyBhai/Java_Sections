package patterns_forLoop;

public class RightAngleTriangleStar3 {
	
//	*	*	*	*	*
//	*	*	*	*
//	*	*	*
//	*	*
//	*
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows =5;
		
		for(int i=rows;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}