package estrutura.dados.pilhas.labs;

import estrutura.dados.pilhas.pilha.Pilha;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroLido = 0;

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println("Entre com um números:");
        for(int i = 1; i <= 10; i++) {
            System.out.println("digite o número " + i);
            numeroLido = scan.nextInt();

            if(numeroLido % 2 == 0) {
                System.out.println("Empilhando número " + numeroLido+ "\n");
                pilha.empilhar(numeroLido);

            } else {
                System.out.println("Número ímpar, desempilhando um elemento da pilha: " + pilha.topo());
                pilha.desempilha();
                if(pilha.estaVazio()){
                    System.out.println("Pilha vazia!");
                }
            }
        }

        System.out.println("Todos os número foram lidos, desempilhando números da pilha.");

        while(!pilha.estaVazio()){
            System.out.println("Desempilhando um elemento da pilha: " + pilha.topo());
            pilha.desempilha();
        }

        System.out.println("Todos os elementos foram desempilhados.");

    }
}
