package exemplos;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String n, String e) {
        this.nome = n;
        this.email = e;
    }

    public String getNome() {
        return nome;
    }

    public String exibirInfo() {
        String mensagem = String.format("O usuário %s tem o email %s", nome, email);
        return mensagem;
    }

}
