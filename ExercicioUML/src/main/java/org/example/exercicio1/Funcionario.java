package org.example.exercicio1;

abstract class Funcionario {

    protected String nome;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularVencimento()
    {
        return 0;
    }

}
