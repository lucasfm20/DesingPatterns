package org.example;

import java.util.List;
import java.util.ArrayList;

public class ToDoList {
    private List<String> lista;



    public ToDoList(List<String> lista) {
        this.lista = lista;
    }
    public ToDoList() {
        this.lista = new ArrayList<>();
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public void adicionaTarefa(String tarefa){
        getLista().add(tarefa);
        System.out.println("tarefa "+tarefa+" adicionada");
    }

    public void apagaTarefa(String tarefa){
        getLista().remove(tarefa);
        System.out.println("tarefa "+tarefa+" removida");

    }

    public void mostrarLista(){
        System.out.println(getLista());
    }
}
