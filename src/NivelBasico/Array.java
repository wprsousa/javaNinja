package NivelBasico;

public class Array {
    public static void main(String[] args) {
        // Arrays são tipos de referência

        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[3]);

        // Array de idade
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // Redelcarar o ARRAY - o array anterior deixa de existir e um novo, vazio, é criado.

        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hataki";
        ninja[6] = "Naruto Uzumaki";
        System.out.println("ninja: " + ninja[0]);

        // For para fazer um loop no array
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }
    }
}
