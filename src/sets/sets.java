package sets;

import java.util.HashSet;
import java.util.Set;

public class sets {
	
//	int arr[] = new int[2];
//	//in array we have to give the size
//	
//	String arr1[] = new String[1000];
	
   
	
	public static void main(String args[]) {
		Set<String> arr = new HashSet<String>(); //generics
		arr.add("sarthak");
		arr.add("sarthak");
		arr.add("kunal");
		//arr.add(1);
		
//		for(int i =0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		for(Object e:arr) {
			System.out.println(e);
		}
		
		//no ordering - no get
		//remove duplicate
	}
	
}
