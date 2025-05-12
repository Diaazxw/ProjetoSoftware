package Entidade;

public class Main {

	public static void main(String[] args) {
		Carro Civic=new Carro();
		Civic.Fabricante ="Honda";
		Civic.Modelo ="Civic";
		Civic.Ano =2008;
		Civic.Placa ="HDF-2345";
		Civic.Cor = "Preto";
		Civic.Acelerar ();
		Civic.ExibirInfo();
		
		Carro Kicks=new Carro();
		Kicks.Fabricante ="Nissan ";
		Kicks.Modelo ="Kicks SV";
		Kicks.Ano =2017;
		Kicks.Placa ="DKE-6526";
		Kicks.Cor = "Preta";
		Kicks.Acelerar ();
		Kicks.ExibirInfo();
		
		Carro Porsche=new Carro();
		Porsche.Fabricante ="Porsche";
		Porsche.Modelo ="Ceyenne";
		Porsche.Ano =2025;
		Porsche.Placa ="FZA-2314";
		Porsche.Cor = "Branco";
		Porsche.Acelerar();
		Porsche.ExibirInfo();
	}

}
