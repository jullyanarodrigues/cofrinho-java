package cofrinhodajully;

import java.util.ArrayList;

// classe que armazena as moedas
public class Cofrinho {

    private ArrayList<Moeda> moedas = new ArrayList<>();

    // adiciona moeda no cofrinho
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    // remove moeda pelo índice
    public void remover(int index) {
        if (index >= 0 && index < moedas.size()) {
            moedas.remove(index);
        } else {
            System.out.println("Índice inválido");
        }
    }

    // lista todas as moedas
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio");
        } else {
            for (int i = 0; i < moedas.size(); i++) {
                System.out.print(i + " - ");
                moedas.get(i).info();
            }
        }
    }

    // calcula o total em reais
    public double totalConvertido() {
        double total = 0;

        for (Moeda m : moedas) {
            total += m.converter();
        }

        return total;
    }
}