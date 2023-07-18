package estrutura.dados.vetores.teste;

import estrutura.dados.vetores.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) {

        Vetor vetor =  new Vetor(5);

        vetor.adiciona("emanoel");
        vetor.adiciona("campos");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

    }
}
