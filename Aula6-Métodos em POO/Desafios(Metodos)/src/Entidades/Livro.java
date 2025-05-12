package Entidades;

public class Livro {
	
	public String Titulo;
	public String Autor;
	public int Quantidade;
	public double  Valor;
	
	public void Empresta (int Quantidade) {
		
		// this informa que é a variavel publica
		//e  nao a criada no parametro
		
		this.Quantidade-= Quantidade;
	}
	public void Devolve(int Quantidade) {
		
		this.Quantidade+= Quantidade;
	}
	public double LivrosValor(){
		double ValorTotal =Quantidade *Valor;
		return ValorTotal;
	}
	// Manualmente exibindo os dados (sem toString )
	
	public String ExibirDados() {
		return "Livro[Titulo="+Titulo+
				"\n, Autor="+Autor+
				"\n,Quantidade="+Quantidade+
				"\n,Valor"+Valor;
				
	}
	// Utilizando toString para exibir os dados IDE
		@Override
		public String toString() {
			return "Livro [Titulo=" + Titulo +
					"\n, Autor=" + Autor +
					"\n, Quantidade=" + Quantidade +
					"\n, Valor=" + Valor + 
					"\n, Valor Total: R$" + LivrosValor();
		}
	
	
}
