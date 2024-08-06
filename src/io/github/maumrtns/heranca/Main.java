package io.github.maumrtns.heranca;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.setNome("Panda");
        panda.setIdade(50);
        panda.imprimirDados();

        Hipopotamo hipopotamo = new Hipopotamo();
        hipopotamo.setNome("Hipo");
        hipopotamo.setIdade(50);
        hipopotamo.imprimirDados();
    }
}
