/**Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles. */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Informe o 1º número: ");
        num1 = scanner.nextInt();
        System.out.print("Informe o 2º número: ");
        num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.print("\nNúmeros no intervalo entre " + menor + " e " + maior + " são: ");
        for (int i = menor + 1; i < maior; i++) {
            System.out.print(i + " ");

        scanner.close();

        }
    }
}
