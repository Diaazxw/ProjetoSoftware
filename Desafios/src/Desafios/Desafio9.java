package Desafios;
import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int Pares = 0;
		int Impares =0;
		int Numeros;
		
		while(true) {
			System.out.print("Digite um Numero (Digite 0 se quiser Finalizar)");
			Numeros =sc.nextInt();
			
			if(Numeros == 0) {
				break;
			}
			if(Numeros % 2 == 0) {
				Pares += Numeros;
				System.out.println("O Número "+Numeros+ " é Par");
			}else {
				Impares+= Numeros;
				System.out.println("O Número "+Numeros+ "é  Ímpar");
			}
		} 
		System.out.println("A Soma dos Números Pares é : "+Pares);
		System.out.println("A Soma dos Números  Ímpares é"+Impares);
		
		sc.close();
	}

}
