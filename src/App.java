public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.acelerar();
        carro.frear();

        Moto moto = new Moto();

        moto.acelerar();
        moto.frear();
        moto.grau();
    }
}
