package vetores.arrays.labs;

import vetores.arrays.vetor.Lista;

public class Exercicio02 {

    public static void main(String[] args) {

        // Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("teste primeiro elemento");
        lista.adiciona("emanoel");
        lista.adiciona("campos");
        lista.adiciona("emanoel");
        lista.adiciona("campos");


        System.out.println(lista.ultimoIndice("teste primeiro elemento"));

    }
}

