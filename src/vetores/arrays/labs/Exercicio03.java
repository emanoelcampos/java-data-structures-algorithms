package vetores.arrays.labs;

import vetores.arrays.vetor.Lista;

public class Exercicio03 {

    public static void main(String[] args) {

        // Melhore a classe Lista e implemente o método remove(T elemento), onde será possível remover um elemento lista passando o mesmo como parâmetro

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("teste primeiro elemento");
        lista.adiciona("emanoel");
        lista.adiciona("campos");
        lista.adiciona("emanoel");
        lista.adiciona("campos");

        lista.remove("teste primeiro elemento");
        lista.remove("campos");
        lista.remove("emanoel");

        System.out.println(lista);
    }
}
