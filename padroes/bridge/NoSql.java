package padroes.bridge;

public class NoSql implements Armazenamento{
    public void salvar() {
        System.out.println("Salvando no banco");
    }

    public void buscar() {
        System.out.println("Buscando informação");
    }

    public void atualizar() {
        System.out.println("Atualizando informação");
    }

    public void remover() {
        System.out.println("Removendo informação do banco");
    }

}
