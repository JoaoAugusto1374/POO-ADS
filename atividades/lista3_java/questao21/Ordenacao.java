package atividades.lista3_java.questao21;
import java.util.Arrays;
public class Ordenacao {
    public int[] ordenarArray(int[] inteiros){
        int[] ordenado = Arrays.copyOf(inteiros, inteiros.length);
        Arrays.sort(ordenado);
        return ordenado;
    }
}
