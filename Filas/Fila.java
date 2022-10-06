package Filas;

import java.util.LinkedList;

public class Fila {
    LinkedList<Object> oFila;

    public Fila() {
        oFila = new LinkedList<Object>();
    }

    public boolean isVazia() {
        return oFila.isEmpty() ? true : false;
    }

    public void inQueue(Object elemento) {
        oFila.add(elemento);
    }

    public Object deQueue() {
        return isVazia() ? null : oFila.remove(oFila.size() - 1);
    }

    public void listar() {
        for (int i = oFila.size() - 1; i >= 0; i--) {
            System.out.println(oFila.get(i));
        }
    }

    public Object primeiro() {
        return isVazia() ? null : oFila.get(oFila.size()-1);

    }

    public Object ultimo() {
        return isVazia() ? null : oFila.get(0);
    }
}
