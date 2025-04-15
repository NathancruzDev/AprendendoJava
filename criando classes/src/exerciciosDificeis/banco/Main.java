package exerciciosDificeis.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exerciciosDificeis.banco.SistemaBancario conta = new SistemaBancario();
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("[1] Consultar Saldo");
            System.out.println("[2] Cheque Especial");
            System.out.println("[3] Depositar Dinheiro");
            System.out.println("[4] Sacar Dinheiro");
            System.out.println("[5] Pagar um Boleto");
            System.out.println("[6] Sair");
            System.out.print("Escolha: ");

        int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    limparTela();
                    SistemaBancario.ConsultarSaldoView(conta);
                    pausa(scanner);
                    limparTela();
                    break;

                case 2:
                    limparTela();
                    navegarChequeEspecial(conta, scanner);
                    limparTela();
                    break;

                case 3:
                    limparTela();
                    navegarDeposito(conta, scanner);
                    limparTela();
                    break;

                case 4:
                    limparTela();
                    navegarSaque(conta, scanner);
                    limparTela();
                    break;

                case 5:
                    limparTela();
                    navegarBoleto(conta, scanner);
                    limparTela();
                    break;

                case 6:
                    executando = false;
                    break;
            }
        }
        scanner.close();
    }

    private static void navegarChequeEspecial(SistemaBancario conta, Scanner scanner) {
        boolean naTela = true;
        while (naTela) {
            SistemaBancario.ConsultarChequeEspecialView(conta);
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para pagar: R$ ");
                    double valor = scanner.nextDouble();
                    if (conta.pagarDivida(valor)) {
                        System.out.println("Dívida paga com sucesso!");
                    } else {
                        System.out.println("Valor inválido ou saldo insuficiente!");
                    }
                    pausa(scanner);
                    break;
                case 2:
                    naTela = false;
                    break;
            }
        }
    }

    private static void navegarDeposito(SistemaBancario conta, Scanner scanner) {
        boolean naTela = true;
        while (naTela) {
            SistemaBancario.DepositarDinheiroView(conta);
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (conta.isUsandoChequeEspecial()) {
                        System.out.print("Valor para pagar: R$ ");
                        double valorPagamento = scanner.nextDouble();
                        if (conta.pagarDivida(valorPagamento)) {
                            System.out.println("Dívida paga com sucesso!");
                        } else {
                            System.out.println("Valor inválido ou saldo insuficiente!");
                        }
                    } else {
                        realizarDeposito(conta, scanner);
                    }
                    pausa(scanner);
                    break;
                case 2:
                    if (conta.isUsandoChequeEspecial()) {
                        realizarDeposito(conta, scanner);
                        pausa(scanner);
                    } else {
                        naTela = false;
                    }
                    break;
                case 3:
                    if (conta.isUsandoChequeEspecial()) {
                        naTela = false;
                    }
                    break;
            }
        }
    }

    private static void realizarDeposito(SistemaBancario conta, Scanner scanner) {
        System.out.print("Valor do depósito: R$ ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    private static void navegarSaque(SistemaBancario conta, Scanner scanner) {
        boolean naTela = true;
        while (naTela) {
            SistemaBancario.SacarDinheiroView(conta);
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > 0 && valorSaque <= conta.getSaldo()) {
                        conta.setSaldo(conta.getSaldo() - valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido ou saldo insuficiente!");
                    }
                    pausa(scanner);
                    break;
                case 2:
                    naTela = false;
                    break;
            }
        }
    }

    private static void navegarBoleto(SistemaBancario conta, Scanner scanner) {
        boolean naTela = true;
        while (naTela) {
            SistemaBancario.PagarUmBoletoView(conta);
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do boleto: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    if (valorBoleto > 0 && valorBoleto <= conta.getSaldo()) {
                        conta.setSaldo(conta.getSaldo() - valorBoleto);
                        System.out.println("Boleto pago com sucesso!");
                    } else {
                        System.out.println("Valor inválido ou saldo insuficiente!");
                    }
                    pausa(scanner);
                    break;
                case 2:
                    naTela = false;
                    break;
            }
        }
    }

    private static void pausa(Scanner scanner) {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void limparTela() {
        for(int i=0;i < 100 ; i++){
            System.out.println();
        }

    }
}