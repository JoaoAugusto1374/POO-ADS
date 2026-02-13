public class Tv {
// dispositivo que define o qe acontece com ele, se liga, desliga, aumenta...
    private boolean ligada = false;

    public void ligar() {
        ligada = true;
        System.out.println("Tv ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Tv desligada");
    }

}
