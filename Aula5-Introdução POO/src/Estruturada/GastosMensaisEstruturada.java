package Estruturada;

public class GastosMensaisEstruturada {

	public static void main(String[] args) {
		
		double AlimentoJan , EnergiaJan, AguaJan , AlimentoFev , EnergiaFev , AguaFev;
		
		AlimentoJan =1000;
		EnergiaJan =300;
		AguaJan=300;
		
		AlimentoFev =1500;
		EnergiaFev =500;
		AguaFev=500;
		
		double TotalJan=AlimentoJan +EnergiaJan +AguaJan;
		double TotalFev = AlimentoFev+EnergiaFev + AguaFev;
		
		if(TotalJan >TotalFev) {
			System.out.println("O Gasto de Janeiro foi Maior que o Gasto de Fevereiro!\n ");
			
		}else {
			System.out.print("O Gasto de Fevereiro foi Maior que o Gasto de Janeiro!\n");
		}
		
		System.out.println("Os Gastos Totais do Mês de Janeiro foi: "+TotalJan);
		System.out.println("Os Gastos Totais do Mês de Fevereiro foi: "+TotalFev);
	}

}
