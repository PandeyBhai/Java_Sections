package stringPractice;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] SubStringsOf_k_Length = new String[(s.length())-k];
        for(int i=0;(i+k)<s.length();i++) {
            SubStringsOf_k_Length[i] = s.substring(i,i+k);
        }
        
        String temp;
        
        for(int i=0;i<SubStringsOf_k_Length.length;i++) {
            for(int j=i+1;j<SubStringsOf_k_Length.length;j++){
                if(SubStringsOf_k_Length[i].compareTo(SubStringsOf_k_Length[j])>0){
                    largest = SubStringsOf_k_Length[i];
                    smallest = SubStringsOf_k_Length[j];
                    temp=largest;
                    
                }
                else
                {
                	smallest = SubStringsOf_k_Length[i];
                }
                temp = largest;
//                else if (SubStringsOf_k_Length[i].compareTo(SubStringsOf_k_Length[j])<0){
//                    smallest = SubStringsOf_k_Length[i];
//                    System.out.println(smallest);
//                }
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}