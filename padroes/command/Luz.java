public class Luz {
// dispositivo que define o qe acontece com ele, se liga, desliga.
    private boolean ligada = false;

    public void ligar() {
        ligada = true;
        System.out.println("Luz ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Luz desligada");
    }

}
