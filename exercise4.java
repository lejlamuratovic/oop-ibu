import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //Create a program that asks for the user's name and prints it in reverse order. You do not need to create a separate method for this.

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = reader.nextLine();

        String reverse = "";

        for(int i = (userName.length() - 1); i >= 0; i--)
        {
            reverse += userName.charAt(i);
        }

        System.out.print("In reverse order: " + reverse);
    }
}
