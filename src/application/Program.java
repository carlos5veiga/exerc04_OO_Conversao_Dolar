package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is de Dollar price? ");
		double cotacao = sc.nextDouble();
		System.out.print("How many Dollars will be bought? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.precoEmReais(cotacao, quantidade));
		
		sc.close();
	}

}
