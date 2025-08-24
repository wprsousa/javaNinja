package Desafios;

import java.util.Scanner;

public class segundoDesafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int NUM_MAXIMO = 7;
        String[] ninjas = new String[NUM_MAXIMO];

        int ninjasCadastrados = 0;
        int opcao = 0;


        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUM_MAXIMO) {
                        System.out.println("Digite o nome do ninja que será cadastrado: ");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas está cheia.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Lista de ninjas vazia");
                    } else {
                        System.out.println("=========Lista de ninjas cadastrados =========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa....aguarde.");
                    break;
                default:
                    System.out.println("Opção digitada está incorreta");
                    break;
            }
        }

    }
}
