package org.example.aprovacaoDespesas;

public class Main {
    public static void main(String[] args) {
        Aprovador gerente = new Aprovador(1000, "Gerente");
        Aprovador diretor = new Aprovador(5000, "Diretor");
        Aprovador vp = new Aprovador(20000, "Vice-Presidente");
        Aprovador presidente = new Aprovador(Double.MAX_VALUE, "Presidente");


        Despesa d1 = new Despesa(800);
        Despesa d2 = new Despesa(3000);
        Despesa d3 = new Despesa(15000);
        Despesa d4 = new Despesa(50000);

        gerente.setProximo(diretor);
        diretor.setProximo(vp);
        vp.setProximo(presidente);

        gerente.aprovarDespesa(d1);
        gerente.aprovarDespesa(d2);
        gerente.aprovarDespesa(d3);
        gerente.aprovarDespesa(d4);

    }

}