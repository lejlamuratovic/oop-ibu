package lab8;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Storehouse {
	private Map<String, Integer> prices;
	private Map<String, Integer> stocks;
	
	public Storehouse() {
		this.prices = new HashMap<>();
		this.stocks = new HashMap<>();
	}
	
	public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }	
	
	public int price(String product) {
		if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
	
	public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }
	
	public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            int stock = this.stocks.get(product);
            if (stock > 0) {
                this.stocks.put(product, stock - 1);
                return true;
            } else {
                return false;
                }
            }
		return false;
        }
	
	public Set<String> products() {
		    return this.prices.keySet();
		  }
}
