package io.github.maumrtns.empresa;

public class Gerente extends Funcionario{

    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }

    @Override
    public double calcularBonificacaoAnual() {
        return getSalario() * 3;
    }
}
