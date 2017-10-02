/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polas;

/**
 *
 * @author Yo
 */
public class PilateEnlazatres {

    private int tp = -1;
    Object pila[];
    private int size = 10;
    Object novo[];

    public PilateEnlazatres() {

        pila = new Object[size];
    }

    public int getSize() {
        return size;
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
        int i;
        if (isFull() == true) {//es el isFull()
            size = size + 10;
            novo = new Object[size];
            for (i = 0; i <= pila.length - 1; i++) {
                novo[i] = pila[i];
            }
            pila = new Object[size];
            for (i = 0; i <= novo.length - 1; i++) {
                pila[i] = novo[i];
            }
            tp++;
            pila[tp] = n;
        } else {
            tp++;
            pila[tp] = n;
        }
    }

    public Object pop() {
        Object x;//guarda dato antes de borra3
        if (empty() == true) {
            System.out.println("La pila esta vacia");
            return -1;
        } else {
            x = pila[tp];
            tp--;
        }
        return x;
    }

    public Object peek() {
        if (empty() == true) {
            System.out.println("La pila esta vacia");
            return -1;
        } else {
            return pila[tp];
        }
    }

}
