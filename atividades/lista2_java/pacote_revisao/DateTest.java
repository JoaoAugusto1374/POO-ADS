package atividades.lista2_java.pacote_revisao;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date data1 = new Date(0, 0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();
        data1.setDia(dia);
        System.out.println("Informe o mês: ");
        int mes = sc.nextInt();
        data1.setMes(mes);
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        data1.setAno(ano);

        
        System.out.println(data1.displayDate(mes, dia, ano));
    }
}
