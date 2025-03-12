package org.example.exercicio1;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusAnual;

    public FuncionarioEfetivo(String nome, double salario, String cargo, double bonusAnual) {
        super(nome, salario, cargo);
        this.bonusAnual = bonusAnual;
    }

    public double calcularVencimento()
    {
        double total;
        total =this.salario +this.bonusAnual;
        return total;
    }



}
