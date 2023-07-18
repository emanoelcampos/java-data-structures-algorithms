package estrutura.dados.pilhas.labs;

import java.util.Scanner;
import java.util.Stack;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        System.out.println("Digite uma palavra:");

        String palavra = scan.next();

        for(int i = 0; i < palavra.length(); i++) {

            stack.push(palavra.charAt(i));
        }

        int metade = stack.size() / 2;
        StringBuilder primeiraMetade = new StringBuilder();
        StringBuilder segundaMetade = new StringBuilder();

        if(stack.size() % 2 == 0) {
            for(int i = 0; i < metade; i++) {
                primeiraMetade.insert(0, stack.pop());
            }

            for(int i = 0; i < metade; i++) {
                segundaMetade.insert(0, stack.pop());
            }

        } else {
            for(int i = 0; i < metade; i++) {
                primeiraMetade.insert(0, stack.pop());
            }

            stack.pop();
            for(int i = 0; i < metade; i++) {
                segundaMetade.insert(0, stack.pop());
            }
        }


        segundaMetade.reverse();

        boolean ePolindromo = primeiraMetade.toString().equalsIgnoreCase(segundaMetade.toString());

        System.out.println(ePolindromo);

    }
}
