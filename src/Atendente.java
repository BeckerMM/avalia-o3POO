
import interfaces.*;
import ordens.*;

import java.util.ArrayList;

public class Atendente extends Usuario implements CriadorOrdem, EditorOrdem, VizualizadorOrdem {


    public Atendente(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        Main.gerenciadorOrdens.criarOrdem(ordem);
    }

    @Override
    public boolean editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
       return Main.gerenciadorOrdens.procurarOrdem(numeroOrdem).editarOrdem(ordem);
    }

    @Override
    public String verOrdens() {
        return Main.gerenciadorOrdens.mostrarDados();
    }
}
