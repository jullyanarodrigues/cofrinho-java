package cofrinhodajully;

// representa moeda em euro
public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    // exibe o valor da moeda
    public void info() {
        System.out.printf("Euro: € %.2f\n", valor);
    }

    // converte euro para real
    public double converter() {
        return valor * 5.70;
    }
}