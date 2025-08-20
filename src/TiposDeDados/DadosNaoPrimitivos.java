package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java.
        /*
         * Dados não primitivos - String, Object, Class, Array
         * Objetivo da aula: Criar um ninja e atribuir métodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // toLowerCase vai colocar tudo em minúsculo.
        System.out.println(aldeiaEmCaixaBaixa);


    }
}
