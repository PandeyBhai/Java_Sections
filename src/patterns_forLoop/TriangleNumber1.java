package patterns_forLoop;

public class TriangleNumber1 {
	
	
//			1
//		2		3
//	4		5		6
//7		8		9		10	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1;i<=4;i++){
			for(int j=(4-i);j>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" "+num);
				num++;
			}
			System.out.println();
		}


	}

}