package estrutura.dados.vetores.teste;

import estrutura.dados.vetores.vetor.Vetor;

public class Aula08 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        vetor.adiciona("emanoel");
        vetor.adiciona("campos");
        vetor.adiciona("viana");

        System.out.println(vetor);
    }
}
