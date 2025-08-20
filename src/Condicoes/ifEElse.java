package Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condições
         * Objetivo: Passar o ninja de nível conforme o número de missões
         */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;


        //se (condicao) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnun");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
