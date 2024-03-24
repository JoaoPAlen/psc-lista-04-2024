/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
*mostrando uma mensagem de erro e voltando a pedir as informações.*/

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario, senha;

        System.out.print("Informe o nome de usuário: ");
        usuario = scanner.nextLine();

        System.out.print("Informe sua senha: ");
        senha = scanner.nextLine();

        while (usuario.equals(senha)) {
            System.out.print("Erro: Senha assemelhasse ao usuário. Digite uma nova senha: ");
            senha = scanner.nextLine();
        }

        System.out.println("Seja bem-vindo, " + usuario + "!");

        scanner.close();
    }
}