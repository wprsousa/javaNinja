package Condicoes;

public class lacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de repetição: vão repetir infinitamente ou até você mandar parar.
         * WHILE = FOR
         */

        // WHILE
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            numeroDeClones++;
//            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
//        }

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está se clonando e já se clonou " + i);

        }
    }
}
