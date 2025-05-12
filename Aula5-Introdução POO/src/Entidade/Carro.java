package Entidade;

public class Carro {
 
	String Fabricante ;
	String Modelo;
	int Ano;
	String Placa;
	String Cor;
	int Veloc;
	
	public double Acelerar() {
		double VelocTotal = Veloc;
		return VelocTotal ;
	}
	public void ExibirInfo() {
		System.out.println(
				"Fabriente: "+Fabricante+
				"\nModelo: "+Modelo+
				"\n Ano: "+Ano +
				"\nPlaca: "+Placa +
				"\nCor: "+ Cor+"\n");
		
	}
}
