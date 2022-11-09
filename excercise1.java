package lab4;

import java.util.*; 

public class excercise1 {

	public static void main(String[] args) {
		//Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) 
		//that inserts the items in a list called second to a list called first. 
		//The order of the items can be anything and the same item can appear in the list more than once. 
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1);

		System.out.println(list2);
	}
	
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		first.addAll(second);
	} 

}
