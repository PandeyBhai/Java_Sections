package patterns_forLoop;

public class LabelledForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i,j;
		
		OuterFor:
		for(i=0;i<5;i++) {
			InnerFor:
			for(j=1;j<=5-i;j++) {
				if(i==4 && j==1) {
					break OuterFor;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
