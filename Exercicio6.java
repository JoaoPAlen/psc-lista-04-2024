/**
 * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
 * outro. Depois modifique o programa para que ele mostre os números um ao
 * lado do outro.
 */

public class Exercicio6 {
    public static void main(String[] args) {

        for (int n = 1; n <= 20; n++) {
            System.out.println(n);
        }

        for (int n = 1; n <= 20; n++) {
            System.out.print(n + " ");
        }

    }

}