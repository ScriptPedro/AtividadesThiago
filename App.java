public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new ProdutoComum("Produto A", 100.0);
        Produto produto2 = new ProdutoPromocional("Produto B", 200.0);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        System.out.println("Preços com desconto de 10%:");
        estoque.exibirPrecosComDesconto(10);
    }
}
