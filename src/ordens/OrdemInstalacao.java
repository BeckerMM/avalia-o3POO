package ordens;

import interfaces.Imprimivel;

public class OrdemInstalacao extends OrdemDeServico {

    private String cliente;
    private String dataInstalacao;


    public OrdemInstalacao(int numeroOrdem, String descricao, String status, String cliente, String dataInstalacao) {
        super(numeroOrdem, descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String mostrarDados() {
        String texto = "";
        return texto += "Cliente : " + this.cliente
                + "\n Data de instalação : " + this.dataInstalacao +
                "\n Numero de Ordem : " + this.getNumeroOrdem() +
                "\n Descrição : " + this.getDescricao() +
                "\n Status : " + this.getStatus();

    }

    @Override
    public boolean editarOrdem(OrdemDeServico ordemDeServico) {
        if (ordemDeServico instanceof OrdemInstalacao) {
            this.setDescricao(ordemDeServico.getDescricao());
            this.setNumeroOrdem(ordemDeServico.getNumeroOrdem());
            this.atualizarStatus(ordemDeServico.getStatus());
            this.dataInstalacao = ((OrdemInstalacao) ordemDeServico).dataInstalacao;
            this.cliente = ((OrdemInstalacao) ordemDeServico).cliente;
            return true;
        }
        return false;
    }
}
