import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop. 
        Scanner reader = new Scanner(System.in); 

        System.out.println("First: "); 
        int first = reader.nextInt();

        System.out.println("Last: "); 
        int last = reader.nextInt();

        while(first <= last) {
            if(first > last) {
                break;
            }
            System.out.println(first);
            first++;
        }

    }
}
