package week6;

import java.util.*; 

public class Main {
	public static void main(String[] args) {
		//exercise 1 
//		int list[] = {6, 5, 8, 7, 11};
//		System.out.println("Smallest: " + smallest(list));
//		
		//excercise 2
//		System.out.println("Index of the smallest: " + indexOfTheSmallest(list));
		
		//exercise 3 
//		int values[] = {-1, 6, 9, 8, 12};
//		
//		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//		
		//exercise 4 
//		int[] values1 = {3, 2, 5, 4, 8};
//		System.out.println(Arrays.toString(values1)); 
//		
//		swap(values1, 1, 0);
//		System.out.println(Arrays.toString(values1)); 
//		
//		swap(values1, 0, 3);
//		System.out.println(Arrays.toString(values1)); 
		
		//excercise6 
//		int[] array = {5, 1, 3, 4, 2};
//		printElegantly(array);
		
		//NIGHTSKY CLASS
//		NightSky NightSky = new NightSky(8, 4);
//		NightSky.print();
//		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
//		System.out.println("");
//		
//		NightSky.print();
//		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		
//		//FRACTION CLASS
//		Fraction fraction = new Fraction(20, 60);
//		System.out.println(fraction); 
		
		//GRADING PROGRAM 
//		Scanner input = new Scanner(System.in);
//	       
//	    System.out.print("Enter in the first quiz score: ");
//	    int quiz1 = (input.nextInt());
//	       
//	    System.out.print("Enter in the second quiz score: ");
//	    int quiz2 = input.nextInt();
//	       
//	    System.out.print("Enter in the midterm exam score: ");
//	    int midtermExam = input.nextInt();
//	       
//	    System.out.print("Enter in the final Exam score: ");
//	    int finalExam = input.nextInt();
//	       
//	    gradesRecord grade = new gradesRecord(quiz1, quiz2, midtermExam, finalExam);
//	    System.out.println(grade);
		
		//COUNTERTYPE CLASS
//		CounterType counter = new CounterType(); 
//		counter.increase();
//		counter.increase();
//		counter.increase();
//		System.out.println(counter);
		
		//THE LIBRARY INFORMATION SYSTEM CLASS
//		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
//		System.out.println(cheese.title());
//		System.out.println(cheese.publisher());
//		System.out.println(cheese.year());
//
//		System.out.println(cheese);
		
//		Library library = new Library();
//
//		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
//		library.addBook(cheese);
//		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
//		library.addBook(nhl);
//
//		library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//		library.printBooks();
		
//		Library library = new Library();
//
//		library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//		library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//		library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//		library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//		ArrayList<Book> result = library.searchByTitle("Cheese");
//		for (Book book: result) {
//		    System.out.println(book);
//		}
//
//		System.out.println("---");
//		for (Book book: library.searchByPublisher("Penguin Group  ")) {
//		    System.out.println(book);
//		}
//
//		System.out.println("---");
//		for (Book book: library.searchByYear(1851)) {
//		    System.out.println(book);
//		}
		
//		Library library = new Library();
//
//		library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//		library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//		library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//		library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//		for (Book book: library.searchByTitle("CHEESE")) {
//		    System.out.println(book);
//		}
//
//		System.out.println("---");
//		for (Book book: library.searchByPublisher("PENGUIN  ")) {
//		    System.out.println(book);
//		}
		
	}
	
	private static int smallest(int[] array) {
		int smallest = array[0]; 
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i]; 
			}
		}
		
		return smallest;
	}
	
	private static int indexOfTheSmallest(int[] array) {
		int smallest = array[0]; 
		int indexOf = 0; 
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < smallest) {
				indexOf = i;
			}
		}
		
		return indexOf;
	}
	
	private static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int smallest = array[index]; 
		int indexOf = index; 
		
		for(int i = (index + 1); i < array.length; i++) {
			if(array[i] < smallest) {
				indexOf = i;
			}
		}
		
		return indexOf;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1]; 
		array[index1] = array[index2]; 
		array[index2] = temp; 
	}

	private static void printElegantly(int[] array) {
		int length = array.length; 
		for(int i = 0; i < (length-1); i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.print(array[(length-1)]);
	}
}
