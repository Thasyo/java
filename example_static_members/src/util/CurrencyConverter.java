package util;

public class CurrencyConverter {
	
	public static final double IOF_PERCENTAGE = 0.06;
	
	public static double converterToReais(double dollarPrice, double dollarValue) {
		
		double totalValueWithoutIOF = dollarPrice * dollarValue;
		
		double totalValueInReais = totalValueWithoutIOF + (IOF_PERCENTAGE * totalValueWithoutIOF);
		
		return totalValueInReais;
	}
	
}
