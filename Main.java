package lab10;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lab10.boxes.BlackHoleBox;
import lab10.boxes.MaxWeightBox;
import lab10.boxes.OneThingBox;
import lab10.boxes.Thing;
import lab10.people.Person;
import lab10.people.Student;
import lab10.people.Teacher;
import lab10.simulator.Alive;
import lab10.simulator.Barn;
import lab10.simulator.BulkTank;
import lab10.simulator.Cow;
import lab10.simulator.Farm;
import lab10.simulator.Milkable;
import lab10.simulator.MilkingRobot;

public class Main {

	public static void main(String[] args) {
		//excercise1
//		Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
//		Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
//		System.out.println (pekka);
//		System.out.println(esko);
		
		
//		Student olli = new Student ("Olli", "Ida Albergintie Street 1 00400 Helsinki"); 
//		System.out.println(olli);
//		olli.study();
//		System.out.println(olli);
		
		
//		Teacher pekka = new Teacher ("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//		Teacher esko = new Teacher ("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//		System.out.println(pekka);
//		System.out.println(esko);
//		
//		Student olli = new Student ("Olli", "Ida Albergintie 1 Street 00400 Helsinki"); 
//		
//		for(int i=0; i < 25; i++) {
//			olli.study();
//		}
//		
//		System.out.println(olli);
		
//		List<Person> people = new ArrayList<Person>();
//		people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
//		people.add(new Student ("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
//		printDepartment (people);
		
		//excercise2
//		BulkTank tank = new BulkTank();
//		tank.getFromTank (100);
//		tank.addToTank (25);
//		tank.getFromTank (5);
//		System.out.println (tank);
//		tank = new BulkTank (50);
//		tank.addToTank (100);
//		System.out.println(tank);
		
//		Cow cow = new Cow(); 
//		System.out.println(cow);
//		
//		Alive livingCow = cow;
//		livingCow.liveHour();
//		livingCow.liveHour();
//		livingCow.liveHour();
//		livingCow.liveHour();
//		
//		System.out.println(cow);
//		
//		Milkable milkingCow = cow;
//		milkingCow.milk();
//		
//		System.out.println(cow);
//		System.out.println("");
//		
//		cow = new Cow("Ammu");
//		
//		System.out.println(cow);
//		cow.liveHour();
//		cow.liveHour();
//		System.out.println(cow);
//		cow.milk();
//		System.out.println(cow);
		
//		MilkingRobot milkingRobot = new MilkingRobot();
//		Cow cow = new Cow();
//		System.out.println("");
//		 
//		BulkTank tank = new BulkTank();
//		milkingRobot.setBulkTank(tank);
//		System.out.println("Bulk tank: " + tank);
//		 
//		for(int i = 0; i < 2; i++) {
//		    System.out.println(cow);
//		    System.out.println("Living..");
//		    for(int j = 0; j < 5; j++) {
//		        cow.liveHour();
//		    }
//		    System.out.println(cow);
//		 
//		    System.out.println("Milking...");
//		    milkingRobot.milk(cow);
//		    System.out.println("Bulk tank: " + tank);
//		    System.out.println("");
//		}
		
//		Barn barn = new Barn(new BulkTank());
//		System.out.println("Barn: " + barn);
//		
//		MilkingRobot robot = new MilkingRobot(); 
//		barn.installMilkingRobot (robot);
//		
//		Cow ammu = new Cow(); 
//		ammu.liveHour();
//		ammu.liveHour();
//		
//		barn.takeCareOf(ammu);
//		System.out.println("Barn: " + barn);
//		
//		LinkedList<Cow> cowList = new LinkedList<Cow>(); 
//		cowList.add(ammu);
//		cowList.add(new Cow());
//		
//		for (Cow cow: cowList) {
//			cow.liveHour();
//			cow.liveHour();
//		}
//
//		barn.takeCareOf(cowList);
//		System.out.println("Barn: " + barn);
		
//		Farm farm = new Farm("Esko", new Barn(new BulkTank())); 
//		System.out.println(farm);
//		System.out.println(farm.getOwner() + "is a tough guy!");
		

//		Farm farm = new Farm("Esko", new Barn (new BulkTank()));
//		farm.addCow(new Cow());
//		farm.addCow(new Cow());
//		farm.addCow(new Cow());
//		farm.liveHour();
//		farm.liveHour();
//		System.out.println(farm);
		
		//excercise 3
		MaxWeightBox coffeeBox = new MaxWeightBox(10);
		coffeeBox.add(new Thing("Saludo", 5));
		coffeeBox.add(new Thing("Pirkka", 5));
		coffeeBox.add(new Thing("Kopi Luwak", 5));
		
		System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
		System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
		System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));
		
//		OneThingBox box = new OneThingBox(); 
//		box.add(new Thing("Saludo", 5));
//		box.add(new Thing("Pirkka", 5));
//		System.out.println(box.isInTheBox(new Thing ("Saludo"))); 
//		System.out.println(box.isInTheBox(new Thing("Pirkka")));
		
//		BlackHoleBox box = new BlackHoleBox(); 
//		box.add(new Thing ("Saludo", 5)); 
//		box.add(new Thing("Pirkka", 5));
//		System.out.println(box.isInTheBox(new Thing("Saludo"))); 
//		System.out.println(box.isInTheBox(new Thing("Pirkka")));
	}
	
	public static void printDepartment(List<Person> people) {
		for (Person person : people) {
		      System.out.println(person);
		      }
	}
}
