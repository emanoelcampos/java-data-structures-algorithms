package vetores.arrays.teste;

import vetores.arrays.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor =  new Vetor(5);

        vetor.adiciona("emanoel");
        vetor.adiciona("elemento para excluir");
        vetor.adiciona("campos");

        System.out.println(vetor);
        vetor.remove(1);
        System.out.println(vetor);
    }
}
