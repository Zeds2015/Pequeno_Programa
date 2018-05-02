package com.zed.banco;

public abstract class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Digite um valor positivo");
        }
    }

    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo Insuficiente/ Digite um valor positivo");
        }
    }

    public void atualizarConta(double taxa) {
        if (taxa > 0) {
            saldo += saldo * taxa;
        } else {
            throw new IllegalArgumentException("Taxa inválida");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}