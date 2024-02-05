import classes.ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.imprimirLista();
        lista.adicionarNaFrente(2);
        lista.adicionarNoFim(45);
        lista.adicionarNaFrente(30);
        lista.adicionarNaFrente(10);
        lista.imprimirLista();
        lista.removeElementoDaLista(2);
        lista.imprimirLista();
    }
}
