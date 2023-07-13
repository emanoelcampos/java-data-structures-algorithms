package vetores.arrays.teste;

import vetores.arrays.vetor.Vetor;

public class Aula07 {

    public static void main(String[] args) {

        Vetor vetor =  new Vetor(10);

        vetor.adiciona("emanoel");
        vetor.adiciona("campos");


        System.out.println(vetor);

        vetor.adiciona(1, "elemento no meio");

        System.out.println(vetor);

    }
}
