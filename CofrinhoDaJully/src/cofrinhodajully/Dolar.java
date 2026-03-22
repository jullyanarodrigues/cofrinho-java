package cofrinhodajully;

// representa moeda em dólar
public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    // exibe o valor da moeda
    public void info() {
        System.out.printf("Dolar: $ %.2f\n", valor);
    }

    // converte dólar para real
    public double converter() {
        return valor * 5.31;
    }
}