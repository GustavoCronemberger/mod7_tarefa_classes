/**
 * @author Gustavo Cronemberger
 */
public class Vendas {
    // ao escolher um automóvel disponível para venda na css, o programa o selecionará e apresentará as características.
    public static void main (String args[]) {
        System.out.println("O Automóvel escolhido pelo cliente é:");
        Automovel automovel = new Automovel();
        System.out.println(automovel.getTipoDeAutomovel());
        System.out.println(automovel.getCodigoDoVeiculo());
        System.out.println(automovel.getModeloDoVeiculo());
        System.out.println(automovel.getAnoDoVeiculo());

    }
}
