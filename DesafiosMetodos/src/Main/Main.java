package Main;
import java.util.Scanner;
import DesafioRoupas.Roupas;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			Roupas Roupa=new Roupas();
			System.out.println("Informe os Dados da Roupa\n :");
			System.out.println("Qual a Marca:");
			Roupa.Marca= sc.nextLine ();
			System.out.println("Tipo:");
			Roupa.Tipo=sc.nextLine();
			System.out.println("Tamanho:");
			Roupa.Tamanho= sc.nextLine();
			System.out.println("Quantidade em Estoque:");
			Roupa.Quantidade=sc.nextInt();
			System.out.println("Valor Unitário:");
			Roupa.Valor=sc.nextDouble();
			
			System.out.println("Informe a Quantidade de Roupas a ser Removida do Estoque:\n ");
			int Quantidade =sc.nextInt();
			Roupa.Decrementa(Quantidade);
			
			System.out.println("Informe a quantidade de roupas a ser adicionada ao estoque: ");
            Quantidade = sc.nextInt();
            
            Roupa.Incrementa(Quantidade);
            
            System.out.println("Dados atualizados da roupa: ");
            System.out.println("Marca: " + Roupa.Marca + ", Tipo: " + Roupa.Tipo + ", Tamanho: " + Roupa.Tamanho + ", Quantidade: " + Roupa.Quantidade + ", Valor Unitário: " + Roupa.Valor);
            System.out.println("Valor total em estoque: " + Roupa.ValorTotal());
            
            
            
            
            sc.nextLine();
            

            System.out.println("Deseja cadastrar outra roupa? (s/n)");
            String resposta = sc.nextLine();
            
            if (resposta.equalsIgnoreCase("n")) {
            	break; 
			
            }
		}
		
		
		sc.close();
		}
	}

