package exerciciospt2.banco;

import java.util.Scanner;

public class SistemaBancario {
    static Scanner scanner = new Scanner(System.in);
    private double saldo = 500;
    private double dividaTotal = 0;
    private boolean usandoChequeEspecial = false;

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDividaTotal() {
        return dividaTotal;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    // Métodos de operações
    public void usarChequeEspecial(double valor) {
        if (valor > 0 && valor <= 50) {
            saldo += valor;
            dividaTotal = valor * 1.20; // Acréscimo de 20%
            usandoChequeEspecial = true;
        }
    }

    public boolean pagarDivida(double valor) {
        if (valor > 0 && valor <= dividaTotal && valor <= saldo) {
            saldo -= valor;
            dividaTotal -= valor;
            if (dividaTotal == 0) {
                usandoChequeEspecial = false;
            }
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Métodos de visualização (Views) das modificacoes das classes.
    public static void ConsultarSaldoView(SistemaBancario conta) {
        System.out.println("\n=== SALDO ===");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        if (conta.isUsandoChequeEspecial()) {
            System.out.println("Dívida: R$ " + conta.getDividaTotal());
        }
    }

    public static void ConsultarChequeEspecialView(SistemaBancario conta) {
        System.out.println("\n=== CHEQUE ESPECIAL ===");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Dívida: R$ " + conta.getDividaTotal());
        System.out.println("\n[1] Pagar Dívida");
        System.out.println("[2] Voltar");
    }

    public static void DepositarDinheiroView(SistemaBancario conta) {
        System.out.println("\n=== DEPÓSITO ===");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        if (conta.isUsandoChequeEspecial()) {
            System.out.println("Dívida: R$ " + conta.getDividaTotal());
            System.out.println("\n[1] Pagar Dívida");
            System.out.println("[2] Apenas depositar");
            System.out.println("[3] Voltar");
        } else {
            System.out.println("\n[1] Realizar depósito");
            System.out.println("[2] Voltar");
        }
    }

    public static void SacarDinheiroView(SistemaBancario conta) {
        System.out.println("\n=== SAQUE ===");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("\n[1] Realizar saque");
        System.out.println("[2] Voltar");
    }

    public static void PagarUmBoletoView(SistemaBancario conta) {
        System.out.println("\n=== PAGAR BOLETO ===");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("\n[1] Pagar boleto");
        System.out.println("[2] Voltar");
    }
}