package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;

	public static double dolarToReais(double dolar,double amount) {
		return dolar*amount+(dolar*amount)*IOF;
	} 
}
