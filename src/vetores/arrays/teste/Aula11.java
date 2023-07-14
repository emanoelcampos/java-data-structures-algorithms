package vetores.arrays.teste;

import vetores.arrays.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(2);

        lista.adiciona("emanoel");
        lista.adiciona("campos");

        System.out.println(lista);
    }
}
