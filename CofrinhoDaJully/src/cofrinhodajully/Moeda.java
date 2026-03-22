package cofrinhodajully;

// classe base das moedas (herança)
public abstract class Moeda {

    protected double valor;

    // construtor da moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    // mostra informações da moeda
    public abstract void info();

    // converte o valor para real
    public abstract double converter();
}