package org.example.exercicio2;

public class Onibus extends Veiculo {
    private double consumoPorKm;

    public Onibus(String capacidade, String modelo, double consumoPorKm) {
        super(capacidade, modelo);
        this.consumoPorKm = consumoPorKm;
    }

    public double calcularConsumo(double distancia,int passageiros)
    {
        double total;
        total= distancia*consumoPorKm;
        return total ;
    }
}
