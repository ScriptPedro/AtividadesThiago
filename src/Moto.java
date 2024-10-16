class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("a moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("a moto está freando. ");
    }

    public void grau() {
        System.out.println("a moto está empinando.");
    }
}