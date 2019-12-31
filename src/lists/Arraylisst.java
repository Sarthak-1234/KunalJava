package lists;

import java.util.ArrayList;
import java.util.List;

public class Arraylisst {
	
//	int arr[] = new int[2];
//	//in array we have to give the size
//	
//	String arr1[] = new String[1000];
	
   
	
	public static void main(String args[]) {
		List<String> arr = new ArrayList<String>(); //generics
		arr.add("sarthak");
		arr.add("sarthak");
		arr.add("kunal");
		//arr.add(1);
		
		for(int i =0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		for(String e:arr) {
			System.out.println(e);
		}
		
		System.out.println(arr.get(2));
	}
	
}
