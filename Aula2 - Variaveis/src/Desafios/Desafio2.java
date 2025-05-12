package Desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o capital inicial em reais: ");
		double C = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros em % ao mês: ");
		double i = sc.nextDouble()/100;
		
		System.out.println("Digite a quantidade de meses: ");
		double t = sc.nextDouble();
		
		
		
		double M = C * Math.pow((1 + i), t);
		
		System.out.println("O montante total após as taxas é de : " + M);
		

	}

}
