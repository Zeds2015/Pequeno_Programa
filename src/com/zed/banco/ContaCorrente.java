package com.zed.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente() {
        super(0);
    }
    
    @Override
    public void atualizarConta(double taxa) {
        super.atualizarConta(taxa * 2);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.10);
    }
}