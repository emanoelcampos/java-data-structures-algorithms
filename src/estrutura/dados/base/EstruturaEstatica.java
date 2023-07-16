package estrutura.dados.base;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public int getTamanho() {
        return tamanho;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
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

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
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
}
