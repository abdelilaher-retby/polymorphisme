package org.example;

public class Chien extends Animal {
    private int num;


    public Chien(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void tst() {
        System.out.println("test");
    }
    @Override
    public void marcher(){

        System.out.println("Cet chien marche  ");

    }
}
