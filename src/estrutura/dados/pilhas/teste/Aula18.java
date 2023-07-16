package estrutura.dados.pilhas.teste;

import estrutura.dados.pilhas.pilha.Pilha;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.add("emanoel");
        stack.add("campos");
        stack.add("elemento para desempilhar");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push("elemento empilhada");

        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
