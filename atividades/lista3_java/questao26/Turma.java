package atividades.lista3_java.questao26;

public class Turma {
    double[] notas;

    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        return media;
    }
    
    public double maiorNota(){
        double maiorNota = notas[0];
        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        return maiorNota;
    }

    public void ordemDecrescente() {
        for (int i = 1; i < notas.length; i++) {
            for (int j = 0; j < i; j++) {
                if (notas[i] > notas[j]) {
                    double temp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = temp;
                }
            }
        }
    }

}
