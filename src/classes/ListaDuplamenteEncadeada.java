package classes;


public class ListaDuplamenteEncadeada {
    private No inicio = null;
    private No fim = null;

    public ListaDuplamenteEncadeada() {
    }

    public void adicionarNoInicio(int data) {
        No novoNo = new No(data);
        //Checa se o início da fila se encontra nulo
        //Se sim o inicio da fila se torna o fim e o inicio(apenas um elemento)
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            //Caso contrário adiciona o elemento no inicio da fila
            //O inicio antigo da fila irá ser o próximo
            novoNo.proximo = this.inicio;
            //O inicio antigo irá apontar agora o seu anterior para o novo nó
            this.inicio.anterior = novoNo;
            //O novo nó se torna o novo inicio
            this.inicio = novoNo;
        }

    }

    public void adicionarNoFim(int data) {
        No novoNo = new No(data);
        //Checa se o fim da lista é nulo
        if (this.fim == null) {
            //Caso verdadeiro o novo nó é o fim e o inicio da fila (apenas um elemento)
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            //Novo nó irá ter como anterior o antigo fim da fila
            novoNo.anterior = this.fim;
            //O antigo fim da fila irá apontar o novo nó como próximo
            this.fim.proximo = novoNo;
            //Novo nó vira o fim da fila
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
        System.out.println("Removendo elemento da lista");
        //loop começa pelo inicio da lista
        No atual = this.inicio;
        //Enquanto atual não chegar ao fim da lista ele irá continuar buscando
        while (atual != null) {
            //Caso tenha um match
            if (atual.data == data) {
                //Checa se anterior é null
                if (atual.anterior != null) {
                    //Caso seja o nódulo que irá ser removido pega o anterior e modifica o seu próximo
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

            atual = atual.proximo;
        }

        System.out.println("Elemento não encontrado");
    }

    public void esvaziarLista(){
        this.inicio = null;
        this.fim = null;
        System.out.println("Lista esvaziada com sucesso");
    }

    public void imprimirDeTrasParaFrente(){
        No atual = this.fim;
        if (this.inicio == null) {
            System.out.println("Lista se encontra vazia");
        } else {
            System.out.println("Lista Invertida:");

            while(atual != null) {
                System.out.println(atual.data);
                atual = atual.anterior;
            }

        }
    }


}

