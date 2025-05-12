package Main;
import Entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria Ph=new ContaBancaria("Ph","0604");
		ContaBancaria Maria =new ContaBancaria("Maria",01801");
		
		Ph.setTitular("Pedro Henrique ");
		Ph.setSaldo(500);
		
		Ph.Depositar(250);
		Ph.Saque(1000);
		
		
		System.out.println("Nome do Titular "+Ph.getTitular());
		System.out.println("Saldo"+Ph.getSaldo());
	}

}
