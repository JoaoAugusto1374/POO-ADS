package atividades.lista2_java.pacote_fatu;
import java.util.Scanner;

public class FaturaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fatura f1 = new Fatura(null, null, 0, 0);

        System.out.println("Informe o numero do produto: ");
        String num = sc.next();
        System.out.println("Informe a descrição dele: ");
        String desc = sc.next();
        System.out.println("Informe a quantidade do produto: ");
        int quan = sc.nextInt();
        System.out.println("Informe o preço do produto: ");
        double prod = sc.nextDouble();

        f1.setNumero(num);
        f1.setDescricao(desc);
        f1.setQuantidade(quan);
        f1.setPreco(prod);
        
        System.out.printf("O produto %s tem a seguinte descrição: %s, na quantidade %d e no preço %.2f tem uma fatura de: %.2f reais", f1.getNumero(), f1.getDescricao(), f1.getQuantidade(), f1.getPreco(), f1.getValorDaFatura(quan, prod));
    }
}
