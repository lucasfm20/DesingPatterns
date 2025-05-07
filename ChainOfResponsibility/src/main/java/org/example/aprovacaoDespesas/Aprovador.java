package org.example.aprovacaoDespesas;

public class Aprovador {

    private double limiteAprovacao;
    private String cargo;
    private Aprovador proximo;

    public Aprovador(double limiteAprovacao, String cargo) {
        this.limiteAprovacao = limiteAprovacao;
        this.cargo = cargo;
    }

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() <= limiteAprovacao) {
            System.out.println(cargo + " aprovou a despesa de valor:"+ despesa.getValor() );
        } else if (proximo != null) {
            proximo.aprovarDespesa(despesa);
        } else {
            System.out.println("Despesa não pode ser aprovada, valor excede o limite.");
        }
    }
}
