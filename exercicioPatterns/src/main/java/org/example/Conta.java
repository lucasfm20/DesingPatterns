package org.example;

import java.util.List;

public class Conta {
    private int numero;

    private double saldo;

    List<Integer> contas;



    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(int numero, double valor)
    {
        double novoSaldo=getSaldo();

        novoSaldo+=saldo;

        setSaldo(novoSaldo);

        System.out.println("Depósito de "+valor+ " feito na conta " + numero+" novo valor de " + novoSaldo);

    }
}
