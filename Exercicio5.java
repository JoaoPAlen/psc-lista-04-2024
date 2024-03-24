/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
 *  Valide a entrada e permita repetir a operação.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int popA, popB;
        double taxaA, tavaB;
        int anos = 0;

        System.out.print("\nInforme a população do pais A: ");
        popA = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a população do pais B: ");
        popB = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a taxa de crescimento do pais A: ");
        taxaA = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Informe a taxa de crescimento do pais B: ");
        tavaB = scanner.nextDouble();
        scanner.nextLine();

        while (popA < popB) {
            popA += (taxaA / 100) * popA;
            popB += (tavaB / 100) * popB;
            anos++;
        }

        System.out.print("\nPopulação do pais A: " + popA);
        System.out.print("\nPopulação do pais B: " + popB);
        System.out.print("\n\nA população do pais 'A' levará " + anos + " anos para ultrapassar a população do pais 'B'.");

        System.out.print("\n\nDeseja repetir o processo? Digite SIM ou NÃO: ");
        String retorno = scanner.nextLine();

        if (retorno.equalsIgnoreCase("SIM")) {
            main(args);
        } else {
            System.out.println("\nPrograma finalizado!");
        }

        scanner.close();
    }
}