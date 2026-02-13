public class LigarTvCommand implements Comando{

    //Comando concreto que chama as operações do dispositivo.
    private Tv x;
    private boolean estado;

    public LigarTvCommand(Tv x) {
        this.x = x;
    }

    public void executar() {
        estado  = false;
        x.ligar();
    }

    public void undo() {
        if(!estado) {
            x.desligar();
        }
    }

}
