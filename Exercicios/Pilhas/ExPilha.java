package Exercicios.Pilhas;

import java.util.ArrayList;

public class ExPilha {
    ArrayList<Object> oPilha;

    public ExPilha() {
        oPilha = new ArrayList<Object>();
    }

    public boolean isVazia() {
        return oPilha.isEmpty() ? true : false;
    }

    public void push(Object elemento) {
        oPilha.add(elemento);
    }

    public Object pop() {
        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);
    }

    public void listar() {
        for (int i = oPilha.size() - 1; i >= 0; i--) {
            System.out.print(oPilha.get(i));
        }
    }

    public Object primeiro() {
        return isVazia() ? null : oPilha.get(oPilha.size()-1);

    }

    public Object ultimo() {
        return isVazia() ? null : oPilha.get(0);
    }

}

