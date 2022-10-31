import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //Create a program that asks for the user's name and gives its characters separately. You do not need to create methods in this exercise.
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = reader.nextLine();

        for(int i = 0; i <= userName.length() - 1; i++)
        {
            System.out.println((i + 1) + ". character: " + userName.charAt(i));
        }
    }
}
