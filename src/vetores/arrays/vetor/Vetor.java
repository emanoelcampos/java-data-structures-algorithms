package vetores.arrays.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < this.tamanho-1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if(this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho-1]);
        }

        sb.append("]");

        return sb.toString();
    }

    /*public void adiciona(String elemento) {
        for(int i = 0; i < this.elementos.length; i++){
            if(elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor jáestá cheio, não é possível adicionar mais elementos");
        }
    }*/

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento) {
        if(!(posicao >= 0 && posicao < elementos.length)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentaCapacidade();

        //mover todos o elementos
        for(int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    public int busca(String elemento) {
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public String busca(int posicao) {
        if(!(posicao >= 0 && posicao < elementos.length)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

}
