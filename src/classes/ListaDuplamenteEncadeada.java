package classes;


public class ListaDuplamenteEncadeada {
    private No inicio = null;
    private No fim = null;

    public ListaDuplamenteEncadeada() {
    }

    public void adicionarNaFrente(int data) {
        No novoNo = new No(data);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }

    }

    public void adicionarNoFim(int data) {
        No novoNo = new No(data);
        if (this.fim == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.anterior = this.fim;
            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }

    }

    public void imprimirLista() {
        No atual = this.inicio;
        if (this.inicio == null) {
            System.out.println("Lista se encontra vazia");
        } else {
            System.out.println("Lista:");

            while(atual != null) {
                System.out.println(atual.data);
                atual = atual.proximo;
            }

            System.out.println();
        }

    }

    public void removeElementoDaLista(int data) {
        for(No atual = this.inicio; atual != null; atual = atual.proximo) {
            if (atual.data == data) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    this.inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    this.fim = atual.anterior;
                }

                return;
            }

            if (atual.proximo == null) {
                System.out.println("Elemento não encontrado");
                return;
            }
        }

    }
}

