import java.util.Scanner; 

public class exercise5 {
    public static void main(String[] args) {
        //Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userInput = Integer.parseInt(reader.nextLine());

        if(userInput > 0){
            System.out.println("The number is positive");
        } 
        else{
            System.out.println("The number is not positive");
        }
    }
}
