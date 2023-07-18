package estrutura.dados.filas.teste;

import estrutura.dados.filas.fila.Fila;

public class Aula20 {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        fila.enfileira("emanoel");
        fila.enfileira("campos");

        System.out.println(fila);
    }
}
