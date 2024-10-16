class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("o carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("o carro está freando. ");
    }
}