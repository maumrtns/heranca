package io.github.maumrtns.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setSalario(1500);
        tecnico.setCpf("0123456789");

        tecnico.imprimirRemuneracao();

        Funcionario gerente = new Gerente();
        gerente.setNome("Ciclano");
        gerente.setSalario(3000);
        gerente.setCpf("9874561230");

        gerente.imprimirRemuneracao();

        System.out.println("Bonus anual: ");
        System.out.println("Gerente: " + gerente.calcularBonificacaoAnual());
        System.out.println("Tecnico: " + tecnico.calcularBonificacaoAnual());

        ConexcaoBancaria conexcaoBancaria = new ConexcaoBancaria();
        GerenciaRH gerenciaRH = new GerenciaRH(conexcaoBancaria);
        gerenciaRH.pagarBonificacaoAnual(gerente);
        gerenciaRH.pagarBonificacaoAnual(tecnico);
    }
}
