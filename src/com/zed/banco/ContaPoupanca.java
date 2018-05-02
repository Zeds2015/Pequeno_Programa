package com.zed.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca() {
        super(0);
    }
    
    @Override
    public void atualizarConta(double taxa) {
        super.atualizarConta(taxa * 3);
    }
}