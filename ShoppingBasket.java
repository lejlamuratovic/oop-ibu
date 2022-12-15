package lab8;
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
	private Map<String, Purchase> purchases;

	public ShoppingBasket() {
		this.purchases = new HashMap<>();
	}
	
	public void add(String product, int price) {
	    Purchase purchase = this.purchases.get(product);

	    if (purchase == null) {
	      purchase = new Purchase(product, 0, price);
	    }

	    purchase.increaseAmount();
	    this.purchases.put(product, purchase);
	}
	
	public int price() {
	    int totalPrice = 0;

	    for (Purchase purchase : this.purchases.values()) {
	      totalPrice += purchase.price();
	    }

	    return totalPrice;
	  }
	
	public void print() {
	    for (Purchase purchase : purchases.values()) {
	      System.out.println(purchase);
	    }
	  }
}
	
