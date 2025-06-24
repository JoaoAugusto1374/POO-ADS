package atividades.lista2_java.questao13;
import java.util.Scanner;

public class EstaTest {
    public static void main(String[] args) {
        Estacionamento carro = new Estacionamento(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas estacionada: ");
        int horas = sc.nextInt();
        carro.setHoras(horas);
        if (horas > 0 && horas < 24) {
            System.out.println("A sua tarifa por estacionar é: " + carro.calculateCharges());
        }
        
    }
}
