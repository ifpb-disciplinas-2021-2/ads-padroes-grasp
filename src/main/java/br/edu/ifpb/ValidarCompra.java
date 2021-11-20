package br.edu.ifpb;

import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 16/11/2021, 11:11:20
 */
public class ValidarCompra {
    private final Venda venda;

    public ValidarCompra(Venda venda) {
        this.venda = venda;
    }
    //data
    //itens
    //estoque
    //...
    public boolean validarCompra(LocalDate data){
        return data.isBefore(
            LocalDate.now()
        );
    }

}
