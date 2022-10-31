import java.util.Scanner; 

public class exercise2 {
    public static void main(String[] args) {
        //Create a program that asks for the user's name and says how many characters the name contains.
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = reader.nextLine();

        System.out.print("Number of characters: " + userName.length());
    }
}
