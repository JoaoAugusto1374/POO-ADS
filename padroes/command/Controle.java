import java.util.Stack;
//Invoker que faz o controle da operação, recebe um comando, faz suas operações e domina as pilhas de redo e undo.
public class Controle {
    private Stack<Comando> desfazer = new Stack<>();
    private Stack<Comando> refazer = new Stack<>();

    public void executarComando(Comando c) {
        c.executar();
        desfazer.push(c);
        refazer.clear();
    }

    
    public void undo() {
        if(!desfazer.isEmpty()) {
            Comando c = desfazer.pop();
            c.undo();
            refazer.push(c);
        } 
    }

    public void redo() {
        if(!refazer.isEmpty()) {
            Comando c = refazer.pop();
            c.executar();
            desfazer.push(c);
        }
    }


}
