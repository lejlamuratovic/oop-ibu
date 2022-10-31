import java.util.Scanner; 
import java.util.ArrayList;

public class exercise7 {
    public static void main(String[] args) {
        //Create the method lengths that gets a list of String variables as a parameter and returns an ArrayList 
        //that contains the lengths of the Strings in the same order as the original list.

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("The lengths of the Strings: " + lengths(list));

    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {

        ArrayList<Integer> listLength = new ArrayList<>();

        for(String name : list) {
            listLength.add(name.length());
        }

        return listLength;
    }
}
