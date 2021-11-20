package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 16/11/2021, 10:04:50
 */
public class Produto {

    private final String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor =valor;
    }
    public double valor(){
        return this.valor;
    }

}

