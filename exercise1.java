import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.

        Scanner reader = new Scanner(System.in);
        String secret = "Secret"; 

        while(true) {
            System.out.println("Type the password: ");
            String password = reader.nextLine();

            if(password.equals("secret")) {
                System.out.println("You are right!");
                break;
            }
        }
        System.out.println("The secret is: " + secret);
   }  
}
