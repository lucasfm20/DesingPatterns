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
        if (numero==this.numero) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " feito na conta " + numero + " novo valor de " + this.saldo);
        }
        else {
            System.out.println("Conta " + numero + " não encontrada.");
        }
    }

    public void sacar(int numero, double valor)
    {
        if (numero==this.numero) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " feito na conta " + numero + " novo valor de " + this.saldo);
        }
        else {
            System.out.println("Conta " + numero + " não encontrada.");
        }
    }

    public void consulta(int numero)
    {
        if(numero==this.numero)
        {
            System.out.println("Saldo de "+ this.saldo + " disponível.");
        }
    }
}
