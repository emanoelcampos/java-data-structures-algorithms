package estrutura.dados.vetores.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList =  new ArrayList<>();

        arrayList.add("emanoel");
        arrayList.add("campos");

        System.out.println(arrayList);

        arrayList.add(1, "adicionando elemento no meio");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("emanoel");
        if(existe) {
            System.out.println("Elemento existe no array.");
        } else {
            System.out.println("Elemento não existe no array.");
        }

        int pos = arrayList.indexOf("campos");
        if(pos > -1) {
            System.out.println(pos);
        } else {
            System.out.println("Elemento não existe no array.");
        }

        arrayList.remove(1); //o elemento também pode ser passado
        System.out.println(arrayList);
    }
}
