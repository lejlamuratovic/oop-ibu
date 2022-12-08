package lab7;
import java.util.*;

public class PromissoryNote {
    private HashMap<String, Double> loans;
    
    public PromissoryNote(){
        loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String to, double value){
        loans.put(to, value);
    }
    
     public double howMuchIsTheDebt(String whose){
         if(loans.containsKey(whose)){
             return loans.get(whose);
         }
         return 0;
     }

}
