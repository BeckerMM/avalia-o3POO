import ordens.GerenciadorOrdens;
import ordens.OrdemInstalacao;
import ordens.OrdemManutencao;

public class Main {
    public static GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();
    public static void main(String[] args) {
        OrdemManutencao ordem1 = new OrdemManutencao(1, "descrição1", "1","Martelo", "10/10/2023");
        OrdemInstalacao ordem2 = new OrdemInstalacao(1,"descricao2", "2", "nome1", "10/10/2023");

        Relatorio relatorio = new Relatorio();
        System.out.println(relatorio.gerarRelatorio(ordem1));
        System.out.println(relatorio.gerarRelatorio(ordem2));

        Adiministrador adm = new Adiministrador("123", "adm");
        adm.criarOrdem(new OrdemInstalacao(1,"descricao 2", "quase finalizado1", "nome 2","10/11"));
        adm.criarOrdem(new OrdemInstalacao(2,"descricao", "quase finalizado", "nome 1","10/10"));
        adm.deletarOrdem(1);
        adm.editarOrdem(2, new OrdemInstalacao(2, "asdasdas", "feito", "nome 2", "10/10"));
        System.out.println(adm.verOrdens());


        System.out.println("===== Atendente =====");

        Atendente atendente = new Atendente("12480948", "Atendente");

        atendente.criarOrdem(ordem1);
        atendente.editarOrdem(1, ordem2);
        System.out.println(atendente.verOrdens());

        System.out.println("===== Solicitente =====");
        Solicitante solicitante = new Solicitante("2349023740937","solicitante");
        solicitante.criarOrdem(new OrdemManutencao(3, "a", "a", "a", "10/10"));
        System.out.println(solicitante.verOrdens());
        System.out.println("Adm edita a ordem do solicitante");
        adm.editarOrdem(3, new OrdemManutencao(3,"aaaaa","a","a","1010100101"));
        System.out.println(solicitante.verOrdens());
        solicitante.editarOrdem(3, new OrdemManutencao(3, "solicitante Mudou", "a", "a", "11111111"));
        System.out.println(adm.verOrdens());
        System.out.println("Atendente ");
        System.out.println(atendente.verOrdens());
    }
}
