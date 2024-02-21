import classes.ListaDuplamenteEncadeada;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        String adicionar;
        do {
            System.out.println("Deseja realizar uma operação a lista?(Y/N)");
            adicionar = scanner.next().toUpperCase();
            if(adicionar.equals("Y")){
                System.out.println("Deseja adicionar ao inicio(APERTE 1), no fim(APERTE 2)? ou remover um elemento?(APERTE 3)");
                int operacao = scanner.nextInt();
                int numero;
                switch (operacao) {
                    case 1 -> {
                        System.out.println("Digite o número para adicionar ao inicio da lista:");
                        numero = scanner.nextInt();
                        lista.adicionarNoInicio(numero);
                        lista.imprimirLista();
                    }
                    case 2 -> {
                        System.out.println("Digite o número para adicionar ao fim da lista:");
                        numero = scanner.nextInt();
                        lista.adicionarNoFim(numero);
                        lista.imprimirLista();
                    }
                    case 3 -> {
                        System.out.println("Digite um elemento que deseja remover da lista:");
                        numero = scanner.nextInt();
                        lista.removeElementoDaLista(numero);
                        lista.imprimirLista();
                    }
                    default -> {
                    }
                }
            }
        }while(!adicionar.equals("N"));
        lista.imprimirDeTrasParaFrente();
        lista.esvaziarLista();
        lista.imprimirLista();
    }
}
