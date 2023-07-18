package estrutura.dados.filas.fila;

import estrutura.dados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }


    public T espiar() {
        if (this.estaVazio()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() {

        final int POS = 0;
        if (this.estaVazio()) {
            return null;
        }

        T primeiroElemento = this.elementos[POS];

        this.remove(POS);

        return primeiroElemento;
    }

}
