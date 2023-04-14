package com.busycoder;
import java.util.*;
public class A_Enhanced_for_each_loop {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8};
//		for(int i=0;i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int temp: arr) {
//			System.out.println(temp);
//		}
		
		List<String> names=List.of("raj", "busycoder","champs","best");
		
		for(String name: names) {
			System.out.println(name);
		}
		
//		Iterator<String> it=names.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}
}
