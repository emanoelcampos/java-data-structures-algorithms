package estrutura.dados.listas.teste;

import estrutura.dados.listas.lista.ListaEncadeada;

public class Aula27 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println(lista.getTamanho());
        System.out.println(lista);
    }
}
