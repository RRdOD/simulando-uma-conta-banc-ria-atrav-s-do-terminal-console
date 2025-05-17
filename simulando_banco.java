import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Mensagem de boas-vindas
        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.println("Vamos criar sua conta bancária.");
        
        // Solicitação dos dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Confirmação da criação da conta
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Titular: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo inicial: R$" + saldo);
        
        // Menu de operações
        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado! Novo saldo: R$" + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado! Novo saldo: R$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo atual é: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
        
        scanner.close();
    }
}