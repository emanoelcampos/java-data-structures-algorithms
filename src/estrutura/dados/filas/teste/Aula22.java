package estrutura.dados.filas.teste;

import estrutura.dados.filas.fila.Fila;

public class Aula22 {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        fila.enfileira("elemento para desenfileirar");
        fila.enfileira("emanoel");
        fila.enfileira("campos");

        System.out.println(fila);
        System.out.println(fila.desenfileira());
        System.out.println(fila);
    }
}
