package Desafios;
import java.util.Scanner;
public class Desafio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Digite um Número Inteiro Positivo ");
		int Numeros = sc.nextInt();
		
		if (Numeros <0) {
			System.out.println("Por Favor , Digite um numero  Inteiro Positvo");
			
		}else {
			long Fatorial = 1;
			
			for (int i = 1; i<Numeros ;i++) {
				Fatorial *=i;
			}
			System.out.print("O fatorial de "+Numeros+"é:"+Fatorial);
		}
		sc.close();
	}

}
