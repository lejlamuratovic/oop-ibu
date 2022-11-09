package lab4;

public class LyrraCard {
	//Then implement the LyyraCard constructor that gets the starting balance of the card as a parameter. 
	//The card saves the balance in the object variable balance. 
	//Implement also the toString method that returns a string of the form "The card has X euros".
	
	private double balance;
	
	public LyrraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
				}

	public String toString() {
		return "The card has " + this.balance + " euros";
		}
	
	//Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.
	//Change methods payEconomical and payGourmet so that if there is not enough money, the balance does not change.
	
	 public void payEconomical() {
	        if(this.balance >= 2.50) {
	        	this.balance -= 2.50;
	        	}
	        } 

    public void payGourmet() {
        if(this.balance >= 4.00) {
        	this.balance -= 4.00;
        	}
        }
    
    //The method should increase the balance of the card by the given amount. 
    //However, the maximum balance on a card is 150 euros. In case the balance after loading money would be more than that, it should be truncated to 150 euros.
    
    //Change the method loadMoney so that the balance of the card does not change if the amount to load is negative.

    public void loadMoney(double amount) {
        if(amount > 0) {
        	if((this.balance + amount) > 150) {
        		this.balance = 150;
        		} else {
        			this.balance += amount;
        		}
        	}
        }
    }

