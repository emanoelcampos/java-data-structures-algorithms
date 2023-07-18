package estrutura.dados.filas.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();


        queue.add("elemento desenfileirado");
        queue.add("emanoel");
        queue.add("campos");

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue.peek());
        System.out.println(queue);



    }
}
