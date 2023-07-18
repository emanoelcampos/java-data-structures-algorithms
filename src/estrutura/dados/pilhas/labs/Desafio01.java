package estrutura.dados.pilhas.labs;

import java.util.Scanner;
import java.util.Stack;

public class Desafio01 {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.next();

        for(int i = 0; i < palavra.length(); i++) {
            stack.push(palavra.charAt(i));
        }

        StringBuilder palavraDesempilhada = new StringBuilder();
        for(int i = 0; i < palavra.length(); i++) {
            palavraDesempilhada.insert(0, stack.pop());
        }

        StringBuilder palavraInversa = palavraDesempilhada.reverse();

        boolean ePolindromo = palavraInversa.toString().equalsIgnoreCase(palavra);

        System.out.println(ePolindromo);

    }

    // ALTERNATIVA DO INSTRUTOR
    public static boolean testaPalindromo(String palavra) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < palavra.length(); i++) {

            stack.push(palavra.charAt(i));
        }

        String palavraInversa = "";

        while(!stack.isEmpty()) {
            palavraInversa += stack.pop();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }
}
