public class LigarLuzCommand implements Comando{
//Comando concreto que chama as operações do dispositivo.
    private boolean estado;
    private Luz x;

    public LigarLuzCommand (Luz x) {
        this.x = x;
    }

    public void executar() {
        estado = false;
        x.ligar();
    }

    public void undo() {
        if(!estado) {
            x.desligar();
        }
    }


    
}
