package atividades.lista3_java.questao26;
import javax.swing.JOptionPane;

public class TurmaTest {
    public static void main(String[] args) {
        Turma t = new Turma();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array: "));
        t.notas = new double[tamanho];

        for(int i = 0; i < tamanho; i++) {
            t.notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
        }

        JOptionPane.showMessageDialog(null, "A média da turma foi: " + t.calcularMedia() + 
        "\nMaior Nota: " + t.maiorNota());


    }
}
