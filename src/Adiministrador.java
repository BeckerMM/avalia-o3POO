import interfaces.*;
import ordens.*;

import java.util.ArrayList;

public class Adiministrador extends Usuario implements CriadorOrdem,EditorOrdem,VizualizadorOrdem,RemovedorOrdem {


    public Adiministrador(String cpf, String nome) {
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
    public void deletarOrdem(int numeroOrdem) {
        Main.gerenciadorOrdens.removerOrdem(Main.gerenciadorOrdens.procurarOrdem(numeroOrdem));
    }

    @Override
    public String verOrdens() {
        return Main.gerenciadorOrdens.mostrarDados();
    }
}
