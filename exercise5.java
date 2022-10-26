import java.util.Scanner; 
public class exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in); 

        System.out.println("Type a number: "); 
        int read = reader.nextInt();
        
        int x = 0;
        int result = 0;

        while(x <= read) {
            result += (int) Math.pow(2, x);
            x++;
        }
        System.out.println("The result is: " + result);
    }
}
