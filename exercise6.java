import java.util.Scanner; 

public class exercise6 {
    public static void main(String[] args){
        //Create a program that asks the user for two numbers and prints the greater of those two. 
        //The program should also handle the case in which the two numbers are equal. 

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine()); 

        System.out.println("Type the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine()); 

        if(numberOne == numberTwo){
            System.out.println("The numbers are equal!");
        } else if(numberOne > numberTwo){
            System.out.println("The greater number: " + numberOne);
        } else{
            System.out.println("The greater number: " + numberTwo);
        }
    }
}
