package AulaDois;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Bem-vindo ao programa teste da aula 2!");
        String teste = sc.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.next();

        System.err.print("nome: " + nome + "\n");
        System.err.print("idade: " + idade + "\n");
        System.err.print("peso: " + peso+ "\n");
        System.err.print("cidade: " + cidade + "\n");

        System.out.print("A idade do(a) " + nome + " é " + idade + " anos." + "\n");
        System.out.printf("Mora na cidade de " + cidade + " e pesa " + peso + " kg.");
        sc.close();
    }
}
