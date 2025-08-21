package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = É um jeito de trazer o usuário para dentro da aplicação
         * Objetivo = O usuário vai criar um ninja e vamos validar os dados
         */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do seu ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir em missões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila.");
        }

        // Fechar o Scanner
        caixaDeTexto.close();


    }
}
