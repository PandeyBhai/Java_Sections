package stringPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class SubStringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String s = input.next();
		String smallest = " ";
		String largest = " ";
		List<String> SubStringsOf_k_Length = new ArrayList<String>();
		for(int i=0;(i+k)<=s.length();i++) {
			SubStringsOf_k_Length.add(s.substring(i,i+k));
		}
//		System.out.println("Before Sorting");
		System.out.println(SubStringsOf_k_Length);
		System.out.println(SubStringsOf_k_Length.size());
//		Collections.sort(SubStringsOf_k_Length);
//		System.out.println("After Sorting");
//		System.out.println(SubStringsOf_k_Length);
		
//		Iterator itr = SubStringsOf_k_Length.iterator();
//		
//		while(itr.hasNext()) {
//			
//		}
		String temp_largest = SubStringsOf_k_Length.get(0);
		String temp_smallest = SubStringsOf_k_Length.get(0);
		for(int i=0;i<SubStringsOf_k_Length.size();i++) {
			if(temp_largest.compareTo(SubStringsOf_k_Length.get(i))>0 || temp_smallest.compareTo(SubStringsOf_k_Length.get(i))<0) {
				continue;
			}
			else {
				for(int j=i+1;j<SubStringsOf_k_Length.size();j++) {
					if(SubStringsOf_k_Length.get(i).compareTo(SubStringsOf_k_Length.get(j))>0) {
						largest = SubStringsOf_k_Length.get(i);
						smallest=SubStringsOf_k_Length.get(j);
					}
					else {
						//smallest = SubStringsOf_k_Length.get(i);
					}
				}
				temp_largest = largest;
				temp_smallest = smallest;
				
			}	
		}
		System.out.println(largest);
		System.out.println(smallest);
//		for(int i=1;i<subStrings_Of_k_Length.length;i++) {
//			System.out.println(subStrings_Of_k_Length[i-1]);
//			smallest = subStrings_Of_k_Length[i-1];
//			if((subStrings_Of_k_Length[i].compareTo(smallest))<0) {
//				largest = subStrings_Of_k_Length[i-1];
//				smallest = subStrings_Of_k_Length[i];
//			}
//		}
//		System.out.println("Smallest:" +smallest);
//		System.out.println("Largest:" +largest);
	}

}