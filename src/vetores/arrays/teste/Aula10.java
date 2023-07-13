package vetores.arrays.teste;

import vetores.arrays.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {

        VetorObjetos vetorObjetos = new VetorObjetos(3);

        Contato c1 = new Contato("emanoel", "7777-7777", "emanoel@email.com");
        Contato c2 = new Contato("david", "9999-9999", "david@email.com");
        Contato c3 = new Contato("lucas", "1313-1313", "lucas@email.com");

        vetorObjetos.adiciona(c1);
        vetorObjetos.adiciona(c2);
        vetorObjetos.adiciona(c3);

        System.out.println("Tamanho = " + vetorObjetos.getTamanho());

        int pos = vetorObjetos.busca(c1);
        if(pos > - 1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
    }
}
