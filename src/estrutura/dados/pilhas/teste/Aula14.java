package estrutura.dados.pilhas.teste;

import estrutura.dados.pilhas.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for(int i = 0; i <=10; i++) {
            pilha.empilhar(i);
        }

        System.out.println(pilha);
    }
}
