package org.example;


import org.example.exercicio1.DataAdapter;
import org.example.exercicio1.DataExterna;
import org.example.exercicio1.DataLocal;

public class Main {
    public static void main(String[] args) {

        DataExterna dataExterna = new DataExterna("2025-04-16");
        DataLocal dataLocal = new DataAdapter(dataExterna);
        System.out.println("Data no formato local: " + dataLocal.getData());

        }


    }
