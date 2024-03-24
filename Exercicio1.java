/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o usuário
informe um valor válido.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.print("Informe uma nota de 0 a 10: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Erro: Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();

            System.out.println("Nota informada: " + nota);

            scanner.close();
        }
    }
}
