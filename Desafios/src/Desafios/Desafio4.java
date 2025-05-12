package Desafios;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual sua idade: ");
        int Idade = sc.nextInt();
        
        System.out.print("Digite seu sexo (M para Masculino, F para Feminino): ");
        String Sexo = sc.next();
        
        System.out.print("Digite seus anos de experiência como motorista: ");
        int Experiencia = sc.nextInt();
        
        double ValorSeguro = 0;

        if (Idade > 25 && Experiencia < 2) {
            if (Sexo.equals("F")) {
                ValorSeguro = 1800;
            }
        } else if (Idade < 25 && Experiencia < 2) {
            if (Sexo.equals("M")) {
                ValorSeguro = 2000;
            } else if (Sexo.equals("F")) {
                ValorSeguro = 1800;
            } else {
                System.out.println("Sexo Inválido!");
                sc.close();
                return;
            }
        } else if (Idade >= 25 || Experiencia >= 2) {
            ValorSeguro = 1200;
        }

       
        System.out.printf("O valor do seu seguro é: R$ %.2f\n", ValorSeguro);
        
        sc.close();
    }
}

