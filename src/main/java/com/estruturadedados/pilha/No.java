package com.estruturadedados.pilha;

public class No {
    private int dado;
    private No reNo = null;

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    public No(int dado) {
        this.dado = dado;
    }
}
