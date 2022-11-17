package week5;

public class Main {
    public static void main(String[] args) {
    	//exercise1 
    	//Implement a class Team. At this stage team has only a name (String) and the following functionality:
    	//a constructor that sets the team name
    	//getName, which returns the name
    	/*Team barcelona = new Team("FC Barcelona");
    	System.out.println("Team: " + barcelona.getName());*/
    	
    	//exercise2 
    	//Create a class Player with the instance variables for the player name and the number of goals. 
    	//A player should have two constructors: one that initializes the name and another that initializes the name and the number of goals.
    	//Implement also the following methods:
    	//getName, returns the player's name
    	//getGoals, returns the number of goals
    	//toString, returns a string representation that is formed as in the example below

    	/*Player brian = new Player("Brian");
        System.out.println("Player: " + brian);
 
        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);*/
        
        //exercise3
        //Add to the class Team the following methods:
        //addPlayer, adds a player to the team
        //printPlayers, prints the players in the team
        //You should store the players in an instance variable of the type ArrayList<Player> within the class Team.

        /*barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
 
        barcelona.printPlayers();*/
        
        //excercise4 
        //Add to the class Team the methods
        //setMaxSize(int maxSize), sets the maximum number of players that the team can have
        //size, returns the number of players on the team
    	//By default, the maximum number of players should be set to 16, and that can be changed with the method setMaxSize. 
    	//Change the method addPlayer so that it does not add players to the team if the team already has the maximum number of players.

    	 /*Team barcelona = new Team("FC Barcelona");
         barcelona.setMaxSize(1);
  
         Player brian = new Player("Brian");
         Player pekka = new Player("Pekka", 39);
         barcelona.addPlayer(brian);
         barcelona.addPlayer(pekka);
         barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
  
         System.out.println("Number of players: " + barcelona.size());*/
         
         //excercise5 
         //Add to the class Team the method
         //goals, returns the total number of goals for all the players in the team
    	
    	Team barcelona = new Team("FC Barcelona");
    	 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
 
        System.out.println("Total goals: " + barcelona.goals());

    }
}
