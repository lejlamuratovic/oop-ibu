package lab9;
import lab9.mooc.logic.ApplicationLogic;
import lab9.mooc.ui.TextUserInterface;
import lab9.mooc.ui.UserInterface;
import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;

public class Main {
	public static void main(String[] args) throws Exception {
		//excercise 1
		UserInterface ui = new TextUserInterface();
		//new ApplicationLogic(ui).execute(3);
		
		//excercise 2
		//Person person1 = new Person("lejla", 2000);
		
		//excercise3
		ConstantSensor ten = new ConstantSensor(10); 
		ConstantSensor minusFive = new ConstantSensor(-5); 
		System.out.println(ten.measure()); 
		System.out.println(minusFive.measure()); 
		System.out.println(ten.ison()); 
		ten.off(); 
		System.out.println(ten.ison());
		
		Sensor kumpula = new Thermometer();
		Sensor helsinkiVantaa = new Thermometer();
		Sensor kaisaniemia = new Thermometer();
		kumpula.on();
		System.out.println("the temperature in Kumpula is " + kumpula.measure() + " degrees");
		
		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);
		helsinkiArea.addSensor(kaisaniemia);
		helsinkiArea.addSensor(helsinkiVantaa);
		helsinkiArea.on();
		System.out.println("the temperature in Helsinki area is "+ helsinkiArea.measure() + " degrees");
		
		
		helsinkiArea.on();
		System.out.println("the temperature in Helsinki area is "+ helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is "+ helsinkiArea.measure() + " degrees");
		System.out.println("the temperature in Helsinki area is "+ helsinkiArea.measure() + " degrees");
		System.out.println("readings: " + helsinkiArea.readings());
		
		//excercise 4
		Printer printer = new Printer ("src/textFile.txt"); 
		printer.printLinesWhichContain("Väinämöinen"); 
		System.out.println("-----"); 
		printer.printLinesWhichContain("Frank Zappa"); 
		System.out.println("-----"); 
		printer.printLinesWhichContain(""); 
		System.out.println("-----");
		
		//exercise 6
		MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary(); 
		dict.add("kuusi", "six"); 
		dict.add("kuusi", "spruce"); 
		dict.add("pii", "silicon"); 
		dict.add("pii", "pi"); 
		System.out.println(dict.translate("kuusi")); 
		
		dict.remove("pii"); 
		System.out.println(dict.translate("pii"));
		
		//exercise 7
		DuplicateRemover remover = new PersonalDuplicateRemover(); 
		remover.add("first");
		remover.add("second");
		remover.add("first");
		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());
		
		remover.add("last");
		remover.add("last");
		remover.add("new");
		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());
		System.out.println("Unique characterStrings: "  + remover.getUniqueCharacterStrings());
		remover.empty();
		
		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());
		System.out.println("Unique characterStrings: " + remover.getUniqueCharacterStrings());
	}
}
