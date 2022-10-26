import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.
        Scanner reader = new Scanner(System.in);

        int sum = 0; 

        while (true) {
            int read = reader.nextInt();
            if(read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum); 
        }

        System.out.println("Sum in the end: " + sum);
    }
}
