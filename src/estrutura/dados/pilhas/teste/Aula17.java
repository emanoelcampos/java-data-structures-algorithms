package estrutura.dados.pilhas.teste;

import estrutura.dados.pilhas.pilha.Pilha;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        pilha.empilhar("emanoel");
        pilha.empilhar("campos");
        pilha.empilhar("elemento que deve sair da pilha"); //LIFO

        System.out.println(pilha.desempilha());

        System.out.println(pilha);
    }
}
