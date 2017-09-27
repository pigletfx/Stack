/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author carlos
 */
public class Pila {

    int tp = -1;
    Object pila[];
    private int size;

    public void Pila() {
        pila = new Object[size];
    }

    public void setSize(int size) {
        pila = new Object[size];
    }

    public boolean isFull() {
        if (tp == pila.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean empty() {
        if (tp == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object n) {
        if (isFull() == true) {
            System.out.println("La lista esta llena");
        } else if (tp == -1) {
            tp = 0;
            pila[tp] = n;
        } else {
            tp++;
            pila[tp] = n;
        }
    }

    public Object pop() {
        Object x;//guarda dato antes de borrar
        if (empty() == true) {
            System.out.println("Esta vacia");
            return -1;
        } else {
            x = pila[tp];
            tp--;
        }
        return x;
    }

    public Object peek() {
        return pila[tp];
    }
}
