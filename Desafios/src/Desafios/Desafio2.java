package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor em real (R$): ");
        double valorReais = sc.nextDouble();
        
        System.out.println("Escolha a moeda para a qual deseja converter:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Libra Esterlina (GBP)");
        System.out.print("Digite a opção desejada: ");
        int moedaOpcao = sc.nextInt();
        
        double valorConvertido = 0;
        String moeda = "";

        switch (moedaOpcao) {
            case 1:
                valorConvertido = valorReais * 0.20;
                moeda = "Dólares (USD)";
                break;
            case 2:
                valorConvertido = valorReais * 0.18;
                moeda = "Euros (EUR)";
                break;
            case 3:
                valorConvertido = valorReais * 0.15;
                moeda = "Libras Esterlinas (GBP)";
                break;
            default:
                System.out.println("Opção Inválida!");
                sc.close();
                return;
        }

        System.out.printf("R$%.2f equivale a %.2f %s%n", valorReais, valorConvertido, moeda);
        
        sc.close();
    }
}
