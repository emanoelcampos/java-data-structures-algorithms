package estrutura.dados.pilhas.pilha;

import estrutura.dados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if(this.estaVazio()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

    public T desempilha() {
        if(this.estaVazio()) {
            return null;
        }
        /*
        T elemento = this.elementos[this.tamanho - 1];
        this.tamanho--;
        return elemento;
         */

        return this.elementos[--tamanho];
    }
}
