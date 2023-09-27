package ordens;

import interfaces.Imprimivel;

public abstract class OrdemDeServico implements Imprimivel {
    private int numeroOrdem;
    private String descricao;
    private String status;

    public OrdemDeServico(int numeroOrdem, String descricao, String status) {
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
        this.status = status;
    }

    public boolean atualizarStatus(String novoStatus){
        this.status = novoStatus;
        return true;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   public abstract boolean editarOrdem(OrdemDeServico ordemDeServico);

}
