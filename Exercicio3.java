/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.print("Informe seu nome: ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Informe sua idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Informe seu salário: ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Informe seu sexo com 'f' ou 'm': ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Informe seu estado civil: ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\nSeu nome é: " + nome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Sua salário é R$ " + salario);
        System.out.println("Seu sexo é: " + sexo);
        System.out.println("Seu estado civil é: " + estadoCivil);

        scanner.close();
    }
}