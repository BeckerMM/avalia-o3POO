package ordens;

import interfaces.Imprimivel;

public class OrdemManutencao extends OrdemDeServico {

    private String equipamento;
    private String dataManutencao;

    public OrdemManutencao(int numeroOrdem, String descricao, String status, String equipamento, String dataManutencao) {
        super(numeroOrdem, descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }

    @Override
    public String mostrarDados() {
        String texto = "";
        return texto += "\n Equipamento  : " + this.equipamento
                + "\n Data de manutencao : " + this.dataManutencao +
                "\n Numero de Ordem : " + this.getNumeroOrdem() +
                "\n Descrição : " + this.getDescricao() +
                "\n Status : " + this.getStatus();

    }

    @Override
    public boolean editarOrdem(OrdemDeServico ordemDeServico) {
        if (ordemDeServico instanceof OrdemManutencao) {
            this.setDescricao(ordemDeServico.getDescricao());
            this.setNumeroOrdem(ordemDeServico.getNumeroOrdem());
            this.atualizarStatus(ordemDeServico.getStatus());
            this.equipamento = ((OrdemManutencao) ordemDeServico).equipamento;
            this.dataManutencao = ((OrdemManutencao) ordemDeServico).dataManutencao;
            return true;
        }
        return false;
    }
}
