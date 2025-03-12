package org.example.exercicio1;

public class FuncionarioTerceirizado extends Funcionario{
    private double custoPorProjeto;

    public FuncionarioTerceirizado(String nome, double salario, String cargo, double custoPorProjeto) {
        super(nome, salario, cargo);
        this.custoPorProjeto = custoPorProjeto;
    }

    public double calcularVencimento()
    {
        double total;
        total =this.salario +this.custoPorProjeto;
        return total;
    }
}
