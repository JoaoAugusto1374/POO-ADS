package projetos.agendamento_servicos;

public class Prestador {
    
    private String nome;
    private String servico;
    private double valorHora;
    
    
    public Prestador(String n, String s, double v) {
        nome = n;
        servico = s;
        valorHora = v;
        
    }

    public String toString() {
        return "Nome: " + nome + ", Serviço: " + servico + ", Valor hora: R$" + valorHora;
    }
    
    public void setNome(String n) {
        nome = n;
    }

    public void setServico(String s) {
        servico = s;
    }

    public void setValorHora(double v) {
        valorHora = v;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getServico() {
        return servico;
    }
    
    public double getValorHora () {
        return valorHora;
    }
    
}
