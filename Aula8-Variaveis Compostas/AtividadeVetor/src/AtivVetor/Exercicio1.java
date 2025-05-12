package AtivVetor;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		List <String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Ana");
		listaNomes.add("Ana Júlia");
		listaNomes.add("Arthur");
		listaNomes.add("Arnaldo");
		listaNomes.add("Enaldinho");
		listaNomes.add("Pedro ");
		listaNomes.add("Gabrieli");
		listaNomes.add("Julio");
		listaNomes.add("Maria Joaquina");

		char letra = 'A';
		int contador = 0;
		
        for (String filtro : listaNomes) {
            if (filtro.charAt(0) == letra) {
                System.out.println(filtro);
                contador++;
            } 
        }

		System.out.println("\nNúmero de itens na lista que começam com A: " + contador + "\n");
		
		
	}

}