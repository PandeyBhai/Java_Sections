package practicePrograms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {23,26,0,1,43,12};
		int n = array.length;  
        for (int j = 1; j < n; j++) { 
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }
            array[i+1] = key;
        }            
		for(int i=0;i<(n);i++) {
			System.out.println(array[i]);
		}
	}

}