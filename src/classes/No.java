package classes;

public class No {
    int data;
    No proximo;
    No anterior;

    public No(int data) {
        this.data = data;
        this.proximo = null;
        this.anterior = null;
    }
}
