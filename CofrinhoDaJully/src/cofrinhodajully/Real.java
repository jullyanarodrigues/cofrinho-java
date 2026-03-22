package cofrinhodajully;

// representa moeda em real
public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    // exibe o valor da moeda
    public void info() {
        System.out.printf("Real: R$ %.2f\n", valor);
    }

    // real já é real (não precisa converter)
    public double converter() {
        return valor;
    }
}