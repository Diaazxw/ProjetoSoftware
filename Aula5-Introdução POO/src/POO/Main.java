package POO;

public class Main {

	public static void main(String[] args) {
		
		GastosMes Jan =new GastosMes();
		GastosMes Fev = new GastosMes();
		
		Jan.Alimentacao =1000;
		Jan.Agua=300;
		Jan.Luz =300;
		
		Fev.Alimentacao =800;
		Fev.Agua = 100;
		Fev.Luz = 300;
		
		double GastosJan =Jan.Contas();
		double GastosFev =Fev.Contas();
		
		if(GastosJan >GastosFev) {
			System.out.println("O Gasto de Janeiro foi Maior que o Gasto de Fevereiro!\n ");
			
		}else {
			System.out.print("O Gasto de Fevereiro foi Maior que o Gasto de Janeiro!\n");
		}
		
		System.out.println("Os Gastos Totais do Mês de Janeiro foi: "+GastosJan);
		System.out.println("Os Gastos Totais do Mês de Fevereiro foi: "+GastosFev);
	}

}
