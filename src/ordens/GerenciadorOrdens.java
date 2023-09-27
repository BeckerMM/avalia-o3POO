package ordens;
import interfaces.*;

import java.util.ArrayList;

public class GerenciadorOrdens implements Imprimivel {

    public ArrayList<OrdemDeServico> ordemDeServicos = new ArrayList<>();


    public void criarOrdem(OrdemDeServico ordem) {
        ordemDeServicos.add(ordem);
    }


    public boolean removerOrdem(OrdemDeServico ordem) {
        return ordemDeServicos.remove(ordem);
    }

    public OrdemDeServico procurarOrdem(int numeroOrdem){
        for (OrdemDeServico ordem : ordemDeServicos) {
            if (ordem.getNumeroOrdem() == numeroOrdem){
                return ordem;
            }
        }
        return null;
    }

    @Override
    public String mostrarDados() {
        String texto = "";
        for (OrdemDeServico ordem: ordemDeServicos) {
            texto += "\n\n" + ordem.mostrarDados();
        }
        return texto;
    }
}
