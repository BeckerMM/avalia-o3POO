import ordens.*;


import java.util.ArrayList;

public abstract class Usuario {
    private String cpf;
    private String nome;
    private ArrayList<OrdemDeServico> ordemDeServicos = new ArrayList<>();

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public ArrayList<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }

    public void setOrdemDeServicos(OrdemDeServico ordemDeServicos) {
        this.ordemDeServicos.add( ordemDeServicos);
    }
}
