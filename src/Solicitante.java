import interfaces.*;

import ordens.OrdemDeServico;

import java.util.ArrayList;

public class Solicitante extends Usuario implements CriadorOrdem, EditorOrdem, VizualizadorOrdem {


    public Solicitante(String cpf, String nome) {
        super(cpf, nome );
    }


    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        Main.gerenciadorOrdens.criarOrdem(ordem);
        this.setOrdemDeServicos(ordem);
    }

    @Override
    public boolean editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (int i = 0; i <this.getOrdemDeServicos().size() ; i++) {
            if(this.getOrdemDeServicos().get(i).getNumeroOrdem() == numeroOrdem){
                this.getOrdemDeServicos().get(i).editarOrdem(ordem);
                return true;
            }
        }
        return false;
    }

    @Override
    public String verOrdens() {
        String texto = "";
        for (OrdemDeServico ordem: this.getOrdemDeServicos()) {
            texto += "\n\n" + ordem.mostrarDados();
        }
        return texto;
    }
}
