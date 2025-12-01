package padroes.bridge;

public class Bdr implements Armazenamento {
    public void salvar() {
        System.out.println("Salvando no banco.");
    }

    public void buscar() {
        System.out.println("Buscando no banco");
    }

    public void atualizar() {
        System.out.println("Atualizando informação");
    }

    public void remover() {
        System.out.println("Deletando informação");
    }

}
