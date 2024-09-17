package io.github.maumrtns.empresa;

public class GerenciaRH {

    private ConexcaoBancaria conexcaoBancaria;

    public GerenciaRH(ConexcaoBancaria conexcaoBancaria) {
        this.conexcaoBancaria = conexcaoBancaria;
    }

    public void pagarBonificacaoAnual(Funcionario funcionario){
        double bonificacao = funcionario.calcularBonificacaoAnual();
        conexcaoBancaria.enviarPagamento(funcionario.getCpf(), bonificacao);
        enviarEmail();
    }
    
    
    private void enviarEmail(){
        System.out.println("Email enviado!");
    }
}
