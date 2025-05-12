package Desafios;
import java.util.Scanner;
public class Desafio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o lado A :");
		double a= sc.nextDouble();
		
		System.out.println("Digite o Lado B:");
		double b = sc.nextDouble();
		
		System.out.println("Digite o lado C");
		double c = sc.nextDouble();
		
		if (a==b&& b== c) {
			System.out.println("O Triângulo é  Equilátero");
		}else if (a==b ||b==c || a==c) {
			System.out.println("O Triângulo é Isósceles");
		}else {
			System.out.println("O Triângulo é Escaleno");
		}
		sc.close();
	}

}
