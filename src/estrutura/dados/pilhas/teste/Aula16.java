package estrutura.dados.pilhas.teste;

import estrutura.dados.pilhas.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        pilha.empilhar("emanoel");
        pilha.empilhar("campos");

        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
