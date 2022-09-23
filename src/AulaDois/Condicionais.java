package AulaDois;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota + nota1 + nota2) / 3;

        if (media > 7) {
            System.out.println("APROVADO");
        } else if  (media >= 4) {
                System.out.println("EM RECUPERAÇÃO");
            } else{
                System.out.println("REPROVADO");
            }

        }
    }

