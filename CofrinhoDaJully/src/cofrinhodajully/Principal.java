package cofrinhodajully;

import java.util.Scanner;
import java.util.Locale;

// classe principal responsável pelo menu do sistema
public class Principal {

    public static void main(String[] args) {
        
        // cria o Scanner para leitura de dados do usuário
        Scanner teclado = new Scanner(System.in);
        
        // define o padrão brasileiro para aceitar vírgula em números
        teclado.useLocale(Locale.forLanguageTag("pt-BR"));
        
        // cria o objeto cofrinho
        Cofrinho cofrinho = new Cofrinho();
        
        int opcao = 0;
        
        // estrutura de repetição do menu
        do {
            System.out.println("\nCofrinho da Jully:");
            System.out.println("1 - Adicione sua moedinha");
            System.out.println("2 - Remova sua moedinha");
            System.out.println("3 - Liste suas moedinhas");
            System.out.println("4 - Total de moedinhas");
            System.out.println("0 - Sair");

            // lê a opção escolhida pelo usuário
            opcao = teclado.nextInt();

            // estrutura que controla as opções do menu
            switch (opcao) {
            
                case 1:
                    // adiciona uma nova moeda ao cofrinho
                    System.out.println("Escolha: 1-Real 2-Dolar 3-Euro");
                    int tipo = teclado.nextInt();
                    
                    System.out.println("Digite o valor:");
                    double valor = teclado.nextDouble();
                    
                    if (tipo == 1)
                        cofrinho.adicionar(new Real(valor));
                    else if (tipo == 2)
                        cofrinho.adicionar(new Dolar(valor));
                    else if (tipo == 3)
                        cofrinho.adicionar(new Euro(valor));
                    break;
                
                case 2:
                    // remove uma moeda pelo índice informado
                    cofrinho.listarMoedas();
                    System.out.println("Digite o número da moeda:");
                    int index = teclado.nextInt();
                    cofrinho.remover(index);
                    break;
                    
                case 3:
                    // lista todas as moedas do cofrinho
                    cofrinho.listarMoedas();
                    break;
                    
                case 4:
                    // mostra o total convertido para reais
                    System.out.printf("Total em reais: R$ %.2f\n", cofrinho.totalConvertido());
                    break;
            }
            
        } while (opcao != 0); // repete até o usuário escolher sair
        
        // fecha o Scanner
        teclado.close();
    }
}