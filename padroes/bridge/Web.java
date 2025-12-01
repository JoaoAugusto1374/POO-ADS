package padroes.bridge;

public class Web {
    protected Armazenamento armazenamento;

    public Web(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void salvar() {
        armazenamento.salvar();
    }

    public void buscar() {
        armazenamento.buscar();
    }

    public void atualizar() {
        armazenamento.atualizar();
    }

    public void deletar() {
        armazenamento.remover();
    }

}
