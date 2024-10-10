class ProdutoPromocional extends Produto {
    public ProdutoPromocional(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem + 5) / 100);
    }
}
