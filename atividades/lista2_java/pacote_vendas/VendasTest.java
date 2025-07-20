package atividades.lista2_java.pacote_vendas;
import java.util.Scanner;

public class VendasTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vendas v1 = new Vendas(0, 0);
        int c = 0;
        double total = 0;
        
        System.out.println("Produtos disponíveis: Produto 1, Produto 2, produto 3, produto 4, produto 5");
        while(c != -1) {
            System.out.println("Digite 1 - produto1\n 2 - produto2\n 3 - produto3\n 4 - produto4\n 5 - produto5\n e -1 para sair do programa.");
            c = sc.nextInt();
            v1.setNumeroProd(c);
            if (c == -1){
                break;
            } 
            
            System.out.println("Digite a quantidade do produto: ");
            int quant = sc.nextInt();
            v1.setQuantidade(quant);
            double valor = v1.calcularVendas();
            System.out.printf("O produto %d na quantidade %d tem valor de %.2f", c, quant, valor);
            total += valor ;
            
        }
        System.out.printf("O valor total da soma dos produtos é %.2f", total);
    }
}
