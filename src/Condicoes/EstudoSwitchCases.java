package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
         * SwitchCases: Que servem para gerar casos específicos
         * Objetivo: Pedir pro usuário escolher entre os ninjas.
         */

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        // Reação ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Usuário escolheu o Naruto Uzumaki, o próximo hokage.");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado.");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno, a personagem feminina mais legal");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente novamente.");
        }


        // Fechar o scanner
        scanner.close();
    }
}
