package Entidades;

public class Veiculos {

	private String Marca;
	private String Modelo;
	private int AnoFabricacao;
	private double valorDiaria;
	
	
	//constructor
	public Veiculos(String marca, String modelo, int anoFabricacao, double valorDiaria) {
		this.Marca = marca;
		this.Modelo = modelo;
		this.AnoFabricacao = anoFabricacao;
		this.valorDiaria = valorDiaria;
	}

	//getters and setters
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		this.Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}

	public int getAnoFabricacao() {
		return AnoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.AnoFabricacao = anoFabricacao;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	//ToString
	@Override
	public String toString() {
		return "Marca: " + Marca +
				"\nModelo: " + Modelo +
				"\nAnoFabricacao: " + AnoFabricacao +
				"\nValorDiaria: " + valorDiaria;
	}
	
	
	
	
	
}

