import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        //Create a method printStars that prints the given amount of stars and a line break. 
        printStars(5);
        printStars(3);
        printStars(9);
    }

    private static void printStars(int amount) {
        int i = 1; 
        while(i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
    }
}
