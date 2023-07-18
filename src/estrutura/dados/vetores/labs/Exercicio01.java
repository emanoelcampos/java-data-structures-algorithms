package estrutura.dados.vetores.labs;

import estrutura.dados.vetores.vetor.Lista;

public class Exercicio01 {

    public static void main(String[] args) {

        // Melhore a classe Lista e implemente o método `contém`, semelhante ao método `contains` da classe ArrayList

        Lista<String> lista = new Lista<>(2);

        lista.adiciona("emanoel");
        lista.adiciona("campos");

        System.out.println(lista.contem("emanoel"));
    }
}
