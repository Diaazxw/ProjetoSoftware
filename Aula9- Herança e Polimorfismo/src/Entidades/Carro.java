package Entidades;


public class Carro extends Veiculos {

	private boolean arCondicionado;
	
	public Carro(String Marca, String Modelo, int AnoFabricacao, double valorDiaria, boolean ArCondicionado) {
		super(Marca, Modelo, AnoFabricacao, valorDiaria);
		this.arCondicionado = ArCondicionado;
		
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAnoFabricacao() +
				"\nValor da diária: " + getValorDiaria() +
				"\nAr condicionado: " + arCondicionado;
				
	}
	
	public double calcularAluguel(int Dias) {
		
		double valorTotal;
		
		if(arCondicionado) {
			valorTotal = getValorDiaria() * Dias * 1.5;
		} else {
			valorTotal = Dias * getValorDiaria();
		}
		
		return valorTotal;
	}

}