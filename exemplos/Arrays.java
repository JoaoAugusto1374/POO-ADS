package exemplos;

public class Arrays {
    
    private double[] notas = new double[3];



    public void setNota(int indice, double valor) {
        notas[indice] = valor;
    }

    public double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }

    public String getSituacao() {
        if( calcularMedia() >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    
}
