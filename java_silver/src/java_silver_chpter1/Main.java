package java_silver_chpter1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//		System.out.println(args[0] + " " + args[1]);
//		int array [] [] = new int [] [] { {1,2} , {2,3,4} };
//		System.out.println(array[1][2] + array[1][1]);
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
//		for(String s : list) {
//			if("B".equals(s)) {
//				list.remove(s);
//			}else {
//				System.out.println(s);
//			}
		for(String s : list) {
			System.out.println(s);
		}
	}

}
