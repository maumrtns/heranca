package io.github.maumrtns.empresa;

public class ConexcaoBancaria {
    public void enviarPagamento(String cpf, double valor){
        System.out.println("CPF: " + cpf + " - Pagamento enviado:   " + valor);
    }
}
