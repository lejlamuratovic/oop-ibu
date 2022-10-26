import java.util.Scanner; 

public class exercise6 {
    public static void main(String[] args) {
        //Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break.
        //Develop the program by adding the following feature: the main program should ask the user how many times the text should be printed
        //(meaning how many times the method is called).
        Scanner reader = new Scanner(System.in); 

        System.out.println("How many times should the text be printed: ");

        int amount = reader.nextInt();
        printText(amount);
    }

public static void printText(int amount) {
    for(int i = 0; i < amount; i++) {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
}

