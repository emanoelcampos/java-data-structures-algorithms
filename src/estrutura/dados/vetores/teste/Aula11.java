package estrutura.dados.vetores.teste;

import estrutura.dados.vetores.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(2);

        lista.adiciona("emanoel");
        lista.adiciona("campos");

        System.out.println(lista);
    }
}
