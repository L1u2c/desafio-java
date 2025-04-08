import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("Dados iniciais do cliente: ");
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("*************************");

        String menu = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        if (opcao == 1){
            System.out.println("O saldo autualizado é " + saldo);
        } else if (opcao == 2) {
            System.out.println("Valor recebido é de: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("Novo saldo: " + saldo);
        } else if (opcao == 3) {
            System.out.println("Qual o valor deseja trasferir");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Não há saldo suficiente para fazer a transferência");
            } else {
                saldo -= valor;
                System.out.println("Novo saldo" + saldo);
            }
        } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
