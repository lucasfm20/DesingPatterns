//Exercício 1

package org.example;
public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calculaArea(int largura, int altura)
    {
        int area = getLargura() * getAltura();
        System.out.println("a área é: " +area);
    }

}
