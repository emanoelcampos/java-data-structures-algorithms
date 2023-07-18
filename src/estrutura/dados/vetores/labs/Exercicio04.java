package estrutura.dados.vetores.labs;

import estrutura.dados.vetores.vetor.Lista;

public class Exercicio04 {

    public static void main(String[] args) {

        // Melhore a classe Lista e implemente o método obtem(int posicao), onde sera possi'vel obter o elemento dada uma posição do vetor. Esse método é semelhante ao método get(int posicao) da classe ArrayList.

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("emanoel");
        lista.adiciona("campos");


        System.out.println(lista.obtem(0));

    }
}
