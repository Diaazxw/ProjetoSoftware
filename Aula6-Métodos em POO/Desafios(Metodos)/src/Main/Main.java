package Main;
import java.util.Scanner;
import Entidades.Livro;
public class Main {

	public static void main(String[] args) {
		Livro Elayne =new Livro();
		Livro Harry =new Livro();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Informe os dados do Livro:");
		System.out.println("Titulo:");
		Elayne.Titulo=sc.nextLine();
		System.out.println("Autor:");
		Elayne.Autor= sc.nextLine();
		System.out.println("Quantidade em Estoque: ");
		Elayne.Quantidade=sc.nextInt();
		System.out.println("Valor:");
		Elayne.Valor=sc.nextDouble();
		
		System.out.println("Informe a Quantidade de Livros Emprestados:");
		int Quantidade =sc.nextInt();
		Elayne.Empresta(Quantidade);
		System.out.println("Dados Atualizados:"+Elayne);
		
		///////////////////////////////////////////////////////////////////
		
		System.out.println("Informe os dados do Livro:");
		System.out.println("Titulo:");
		Harry.Titulo=sc.nextLine();
		System.out.println("Autor:");
		Harry.Autor= sc.nextLine();
		System.out.println("Quantidade: ");
		Harry.Quantidade=sc.nextInt();
		System.out.println("Valor:");
		Harry.Valor=sc.nextDouble();
		
		System.out.println("Informe a Quantidade de Livros Emprestados:");
		Quantidade =sc.nextInt();
		Harry.Empresta(Quantidade);
		
		System.out.println("Informe a quantidade de livros devolvidos: ");
		Quantidade = sc.nextInt();
		Harry.Devolve(Quantidade);
		System.out.println("Dados Atualizados:"+Harry);
		
	}

}
