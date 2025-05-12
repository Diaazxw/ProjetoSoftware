package AtivVetor;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List <Integer> numeros = new ArrayList<>();
		
		int soma = 0;
		double media;
		
		numeros.add(6);
		numeros.add(10);
		numeros.add(18);
		numeros.add(21);
		numeros.add(9);
		
		for( int numero : numeros) {
			
			soma = numero + soma;
		}
		
		 media = (double) soma / numeros.size();

	        System.out.println("Soma dos números: " + soma);
	        System.out.println("Média dos números: " + media);
	}

}