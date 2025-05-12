package Desafios;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Valor total da sua Compra:");
		double Compras = sc.nextDouble();
		
		System.out.println("Digite o Número de itens ADquiridos:");
		int Itens = sc.nextInt();
		
		double Desconto = 0;
		
		if (Compras>1000) {
			Desconto =0.20;
		}else if(Compras>500|| Itens>5) {
			Desconto = 0.10;
			
		}else if(Compras>300|| Itens >3) {
			Desconto=0.05;
		}
		double ValorDesconto =Compras*Desconto ;
		double ValorFinal = Compras -ValorDesconto;
	
	if (Desconto >0) {
		System.out.printf("Desconto de %.f%% Aplicado!Valor do Desconto: R$ %.2f\n",Desconto *100, ValorDesconto );
	}else {
		System.out.println("Nenhum Desconto Aplicado!");
	}
	System.out.printf("Valor Final da Compra: R$ %.2f\n",ValorFinal);
	sc.close();
	}
}
