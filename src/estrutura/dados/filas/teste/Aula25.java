package estrutura.dados.filas.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade);

    }
}
