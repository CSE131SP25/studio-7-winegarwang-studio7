package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public String product(Fraction a, Fraction b) {
		int newNumerator = a.getNumerator() * b.getNumerator();
		int newDenominator = a.getDenominator() * b.getDenominator();
		return (newNumerator + "/" + newDenominator);
		
	}
	
	public String sum(Fraction a, Fraction b) {
		if (a.getDenominator() == b.getDenominator()) {
			return (a.getNumerator() + b.getNumerator() + "/" + a.getDenominator());
		} else {
			return (a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator() + "/" + a.getDenominator() * b.getDenominator());
		}
	}
	
	public String reciporical() {
		int reverseDenominator = getNumerator();
		int reverseNumerator = getDenominator();
		return (reverseNumerator + "/" + reverseDenominator);
	}
	
	public String simplify() {
		if (getNumerator() % 2 == 0 && getDenominator() % 2 == 0) {
		}
	}

	public static void main(String[] args) {
		Fraction a = new Fraction(5, 4);
		Fraction b = new Fraction(10, 8);
		System.out.println(a.numerator + "/" + a.denominator);
		System.out.println(b.numerator + "/" + b.denominator);
	}

}
