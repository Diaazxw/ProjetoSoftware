package Desafios;
import java.util.Scanner;
public class Desafio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do empréstimo: R$");
		double ValorEmprestimo =sc.nextDouble();
		
		System.out.println("Escolha o número de Parcelas:");
		System.out.println("1. 6 Meses");
		System.out.println("2. 12 Meses");
		System.out.println("3. 24 meses");
		System.out.println("Digite o número  deseja fazer de parcelas: ");
		
		int Parcelas=sc.nextInt();
		
		double ValorFinal=0;
		
		switch(Parcelas) {
		
		case 1:
			ValorFinal= ValorEmprestimo*1.05;
		break;
		
		case 2: 
			ValorFinal = ValorEmprestimo*1.10;
		break;
		
		case 3:	
			ValorFinal=ValorEmprestimo *1.20;
		break;
		default:
			System.out.println("Opção inválida!");
			
		sc.close();
		return;
		}
		System.out.printf("O valor Total a ser pago após %d meses é :R$ %.2f\n",Parcelas,ValorFinal);
		
		sc.close();
		
	}

}
