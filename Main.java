package week5;

public class Main {
    public static void main(String[] args) {
    	//exercise1 
    	/*Team barcelona = new Team("FC Barcelona");
    	System.out.println("Team: " + barcelona.getName());*/
    	
    	//exercise2
    	/*Player brian = new Player("Brian");
        System.out.println("Player: " + brian);
 
        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);*/
        
        //exercise3
        /*barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
 
        barcelona.printPlayers();*/
        
        //excercise4 
    	 /*Team barcelona = new Team("FC Barcelona");
         barcelona.setMaxSize(1);
  
         Player brian = new Player("Brian");
         Player pekka = new Player("Pekka", 39);
         barcelona.addPlayer(brian);
         barcelona.addPlayer(pekka);
         barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
  
         System.out.println("Number of players: " + barcelona.size());*/
         
        //excercise5 
    	Team barcelona = new Team("FC Barcelona");
    	 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
 
        System.out.println("Total goals: " + barcelona.goals());

    }
}
