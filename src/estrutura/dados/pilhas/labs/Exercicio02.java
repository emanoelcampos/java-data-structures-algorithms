package estrutura.dados.pilhas.labs;

import estrutura.dados.pilhas.pilha.Pilha;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        System.out.println("Entre com um número:");

        for(int i = 1; i <= 10; i++) {
            int numero= scan.nextInt();

            if(numero == 0) {
                par.desempilha();
                impar.desempilha();
            } else if (numero % 2 == 0) {
                par.empilhar(numero);
            } else {
                impar.empilhar(numero);
            }
        }

        par.desempilha();
        impar.desempilha();
    }
}
