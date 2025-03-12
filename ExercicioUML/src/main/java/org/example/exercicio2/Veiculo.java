package org.example.exercicio2;

public class Veiculo {
    protected String modelo;
    protected String capacidade;


    public Veiculo(String capacidade, String modelo) {
        this.capacidade = capacidade;
        this.modelo = modelo;
    }

    public double calcularConsumo(double distancia,int passageiros)
    {
        return 0;
    }
}
