/*Faça um programa que leia 5 números e informe o maior número.*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, num4, num5, maiorNum;

        System.out.print("Informe o 1º número: ");
        num1 = scanner.nextInt();
        System.out.print("Informe o 2º número: ");
        num2 = scanner.nextInt();
        System.out.print("Informe o 3º número: ");
        num3 = scanner.nextInt();
        System.out.print("Informe o 4º número: ");
        num4 = scanner.nextInt();
        System.out.print("Informe o 5º número: ");
        num5 = scanner.nextInt();

        maiorNum = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));

        System.out.println("O maior número é: " + maiorNum);

        scanner.close();

    }

}