package io.github.maumrtns.heranca;

public class Hipopotamo extends Animal{
    private int forcaMordida;

    public void ficarNaAgua(){
        System.out.println("estou na água...");
    }
    public int getForcaMordida() {
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }
}
