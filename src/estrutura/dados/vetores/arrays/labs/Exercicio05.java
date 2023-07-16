package estrutura.dados.vetores.arrays.labs;

import estrutura.dados.vetores.arrays.vetor.Lista;

public class Exercicio05 {

    public static void main(String[] args) {

        // Melhore a classe Lsta e implemente o método limpar, onde todos os elementos da lista são removidos. Esse método é semelhante ao método clear da classe ArrayList.

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("emanoel");
        lista.adiciona("emanoel");
        lista.adiciona("campos");
        lista.adiciona("campos");

        System.out.println(lista);

        lista.limpa();

        System.out.println(lista);

    }
}
