import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //Create a program that asks the user for three numbers and then prints their sum.
        Scanner reader = new Scanner(System.in); 

        int sum = 0;
        int read; 

        System.out.println("Input first number: ");
        read = Integer.parseInt(reader.nextLine());

        System.out.println("Input second number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.println("Input third number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.println("The sum is: " + read);
    }
}
