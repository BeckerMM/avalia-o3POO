import interfaces.Imprimivel;

public class Relatorio {
    public String gerarRelatorio(Imprimivel objeto){
        return objeto.mostrarDados();
    }
}
