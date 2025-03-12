package org.example.exercicio2;

public class Taxi extends Veiculo {
    private double taxaPorPassageiro;

    public Taxi(String capacidade, String modelo, double taxaPorPassageiro) {
        super(capacidade, modelo);
        this.taxaPorPassageiro = taxaPorPassageiro;
    }

    public double calcularConsumo(double distancia,int passageiros)
    {
        double total;
        total= distancia*(passageiros*taxaPorPassageiro);
        return total ;
    }
}
