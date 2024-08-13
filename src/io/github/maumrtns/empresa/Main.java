package io.github.maumrtns.empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setSalario(1500);
        tecnico.setCpf("0123456789");

        tecnico.imprimirRemuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Ciclano");
        gerente.setSalario(3000);
        gerente.setCpf("9874561230");

        gerente.imprimirRemuneracao();
    }
}
