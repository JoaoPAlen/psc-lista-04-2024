/**Faça um programa que leia 5 números e informe a soma e a média dos
números.
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, num4, num5, soma, media;

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

        soma = num1 + num2 + num3 + num4 + num5;
        System.out.print("\nA soma dos números informados é: " + soma);

        media = soma / 5;
        System.out.print("\nA média dos números informados é: " + media);

        scanner.close();
    }

}

