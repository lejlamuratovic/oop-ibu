package lab4;

public class Main {

	public static void main(String[] args) {
		//excercise2 
		Dice dice = new Dice(6);
		
		/*int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }*/
        
        //excercise3
        LyrraCard card = new LyrraCard(10);
        /*System.out.println(card);
        
        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
        
        card.loadMoney(-15);
        System.out.println(card); */
        
        LyrraCard cardPekka = new LyrraCard(20);
        LyrraCard cardBrian = new LyrraCard(30);
        
        //Pekka buys gourmet lunch
        //Brian buys economical lunch
        cardPekka.payGourmet(); 
        cardBrian.payEconomical();
        
        //Cards are printed (both on their own row, starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        //Pekka loads 20 euros
        //Brian buys gourmet lunch
        cardPekka.loadMoney(20);
        cardBrian.payGourmet(); 
        
        //Cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        //Pekka buys economical lunch
        //Pekka buys economical lunch
        //Brian loads 50 euros
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        
        //Cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

	}
}
