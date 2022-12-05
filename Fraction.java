package week6;

public class Fraction {
	public int numerator; 
	public int denominator; 
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator; 
		this.denominator = denominator; 
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
	}
	
	public void setDenominator(int den) {
		this.denominator = den;
	}

	public double divided() {
		return (this.numerator/this.denominator);
	}
	
	public int gcd() {
	    int gcd = 1;
	    for (int i = 1; i <= this.numerator && i <= this.denominator; ++i) {
	      if (this.numerator % i == 0 && this.denominator % i == 0)
	        gcd = i;
	    }
	    return gcd;
	}
	
	public void lowestTerms() {
		int gcd = gcd();
		this.numerator /= gcd; 
		this.denominator /= gcd; 
	}
	
    public String toString()
    {
    	lowestTerms();
        return this.numerator + "/" + this.denominator;
    }
}
