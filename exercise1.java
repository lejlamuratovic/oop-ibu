public class exercise1 {
    public static void main(String[] args) {
        //Create the method average, which calculates the average of the numbers it gets as parameters. 
        //Inside the method you should use the method sum as a helper!
        double answer = average(4, 3, 5, 1);
        System.out.println("Average: " + answer);
    }
    public static double average(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4; 
        return(sum/(double)4);
    }

}
