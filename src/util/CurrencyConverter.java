package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double precoEmReais(double cotacao, double quantidade) {
		double total = cotacao*quantidade;
		return total + total*IOF;
	}
}
