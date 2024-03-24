/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int paisA = 80000;
        int paisB = 200000;
        double taxaA = 3;
        double tavaB = 1.5;
        int anos = 0;

        while (paisA < paisB){
            paisA += (taxaA / 100) * paisA;
            paisB += (tavaB / 100) * paisB;
            anos++;
        }

        System.out.print("População do pais A: " + paisA);
        System.out.print("\nPopulação do pais B: " + paisB);
        System.out.print("\nA população do pais 'A' levará " + anos + " anos para ultrapassar ou igualar a população do pais 'B'.");

        scanner.close();
    }    
}