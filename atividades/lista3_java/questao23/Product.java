package atividades.lista3_java.questao23;

public class Product {
    public int produtosVariaveis(int... numeros) {
        int produto = 1;
        for(int i = 0; i < numeros.length; i++) {
            produto *= numeros[i];
        }
        return produto;
    }
}
