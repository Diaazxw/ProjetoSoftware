package Desafios;
import java.util.Scanner;
import java.util.Random;
public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int  NumeroMisterioso =random.nextInt(10)+1;
		System.out.println("Adivinhe o NUmero Misterioso:");
		
		int palpite = sc.nextInt();
		
		if (palpite == NumeroMisterioso ) {
			System.out.println("Parabéns!Você Acertou  o número Misterioso!");
		}else{
			System.out.println("Você errou o número Misterioso,o número era :"+NumeroMisterioso);
		}
		sc.close();
	}

}
