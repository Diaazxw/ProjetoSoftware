package Entidades;

public class ContaBancaria {
	private String Titular;
	private double Saldo;
	
	public ContaBancaria(String Titular , double Saldo) {
		super();
		this.Titular=Titular;
		this.Saldo=Saldo;
		
	}
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String Titular) {
		this.Titular=Titular;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo() {
		this.Saldo=Saldo;
	}
	public void Depositar(double Valor) {
		if (Valor >0) {
			Saldo +=Valor;
		}else {
			System.out.println("Valor Depositado Inválido");
		}
	}
	public  void Saque(double Sacar) {
		if (Saldo >= Sacar && Sacar>0) {
			Saldo -= Sacar;
		}else {
			System.out.println("Saque Inválido");
		}
	}
	@Override
	public String toString() {
		return "ContaBancaria [Titular=" + Titular + ", Saldo=" + Saldo + "]";
	}
	
}
