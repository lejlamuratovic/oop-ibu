package lab8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exercise 2
		Book book1 = new Book("Writer 1", "Name 1", 1);
		Book book2 = new Book("Writer 2", "Name 2", 2);
		Book book3 = new Book("Writer 3", "Name 3", 3);
		
		CD cd1 = new CD("Artist 1", "Title 1", 2000);
		CD cd2 = new CD("Artist 2", "Title 2", 2000);
		CD cd3 = new CD("Artist 3", "Title 3", 2000);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
		
		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
		
		Box box = new Box(12); 
		box.add(book1);
		box.add(book2);
		box.add(book3);
		
		Box box2 = new Box(17); 
		box.add(cd1);
		box.add(cd2);
		box.add(cd3);
		
		System.out.println(box);
		System.out.println(box2);
		
		//exercise 3
		GenericClass<String> object1 = new GenericClass<String>("Hello world!");
		GenericClass<Integer> object2 = new GenericClass<Integer>(42);
		
		System.out.println(object1);
		System.out.println(object2);
		
		//Storehouse class
//		Storehouse store = new Storehouse(); 
//		store.addProduct("coffee", 5, 6);
//		store.addProduct("milk", 3, 10);
//		store.addProduct("buttermilk", 2, 20);
//		store.addProduct("jogurt", 2, 20);
//		
//		System.out.println("products: "); {
//			for(String product : store.products()) {
//				System.out.println(product);
//			}
//		}
//		
//		Purchase purchase = new Purchase("milk", 4, 2);
//		System.out.println("the total price of a purchase containing four milks is " + purchase.price());
//		System.out.println(purchase);
//		purchase.increaseAmount();
//		System.out.println(purchase);
		
		ShoppingBasket basket = new ShoppingBasket();
		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() + "\n");
		
		basket.add("buttermilk", 2);
		basket.print();
		System.out.println("basket price: " + basket.price() + "\n");
		
		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() + "\n");
		
		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() + "\n");
		
		Storehouse store = new Storehouse(); 
		store.addProduct("coffee", 5, 10);
		store.addProduct("milk", 3, 20);
		store.addProduct("milkbutter", 2, 55);
		store.addProduct("bread", 7, 8);
		
		Shop shop = new Shop(store, new Scanner(System.in));
		shop.manage("Pekka");
		
		
	}

}
