package Desafios;
import java.util.Scanner;
public class Desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado A :");
		double a= sc.nextDouble();
		
		System.out.println("Digite o Lado B:");
		double b = sc.nextDouble();
		
		System.out.println("Digite o lado C");
		double c = sc.nextDouble();
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Os Valores Formam um Triângulo ");
		}else {
			System.out.println("Os Valores NÃO Formam um Triângulo");
		}
		sc.close();
		
	}

}
