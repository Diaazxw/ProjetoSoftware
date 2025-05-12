package Desafios;

import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double media;
        int Soma = 0;
        int Cont = 0;
        int Numero;
        System.out.println("Digite números para calcular a média (Se quiser cancelar, digite 0)");
        
        do {
            System.out.print("Digite o número: ");
            Numero = sc.nextInt();
            
            if (Numero != 0) {
                Soma += Numero;
                Cont++;
            }
        } while (Numero != 0);
        sc.close();
        
        if (Cont > 0) {
           media= (double) Soma/Cont;
            System.out.printf("A média dos números digitados é: %.2f\n" , media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        
        
    }
}
