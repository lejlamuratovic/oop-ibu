import java.util.Scanner; 

public class exercise4 {
    public static void main(String[] args) {
        //Create a program that asks the user for two integers and then prints their sum
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine()); 

        System.out.println("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine()); 

        System.out.println("Sum of the numbers: " + (numberOne + numberTwo));
    }  
  }
