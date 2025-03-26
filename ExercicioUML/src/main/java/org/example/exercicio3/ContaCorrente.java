package org.example.exercicio3;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        double limiteDisponivel = saldo + limiteChequeEspecial;
        if (valor > 0 && valor <= limiteDisponivel) {
            saldo -= valor;  // Deduz o valor do saldo
            return valor;  // Retorna o valor sacado
        }
        System.out.println("Saldo insuficiente ou valor inválido.");
        return 0.0;  // Retorna 0 se o saque não for possível
    }
}
