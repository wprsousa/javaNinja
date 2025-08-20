package Desafios;

public class primeiroDesafio {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String nomeDaMissao1 = "Caçar um javali";
        char nivelDaMissao1 = 'B';
        String statusDaMissao1 = "não concluída";

        // Verificar nível da missão e idade

        if (idadeNinja1 < 15 && (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D')) {
            statusDaMissao1 = "concluída";
        } else if (idadeNinja1 >= 15) {
            statusDaMissao1 = "concluída";
        } else statusDaMissao1 = "não concluída";

        System.out.println("-------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Nome da missão: " + nomeDaMissao1);
        System.out.println("Nível da missão: " + nivelDaMissao1);
        System.out.println("Status da missão: " + statusDaMissao1);

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 18;
        String nomeDaMissao2 = "Salvar criança afogada";
        char nivelDaMissao2 = 'B';
        String statusDaMissao2 = "não concluída";

        if (idadeNinja2 < 15 && (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D')) {
            statusDaMissao2 = "concluída";
        } else if (idadeNinja2 >= 15) {
            statusDaMissao2 = "concluída";
        } else statusDaMissao2 = "não concluída";

        System.out.println("-------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Nome da missão: " + nomeDaMissao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);
        System.out.println("Status da missão: " + statusDaMissao2);

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 17;
        String nomeDaMissao3 = "Invadir vila de São Vicente";
        char nivelDaMissao3 = 'D';
        String statusDaMissao3 = "não concluída";

        if (idadeNinja3 < 15 && (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D')) {
            statusDaMissao3 = "concluída";
        } else if (idadeNinja3 >= 15) {
            statusDaMissao3 = "concluída";
        } else statusDaMissao3 = "não concluída";

        System.out.println("-------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Nome da missão: " + nomeDaMissao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);
        System.out.println("Status da missão: " + statusDaMissao3);

        if (idadeNinja1 < 15 && (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D')) {
            statusDaMissao1 = "concluída";
        } else if (idadeNinja1 >= 15) {
            statusDaMissao1 = "concluída";
        } else statusDaMissao1 = "não concluída";


    }
}
