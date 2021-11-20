package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 16/11/2021, 10:04:27
 */
public class ItemDeVenda {

    private final Produto produto;
    private final int quantidade;
    
    private double desconto;

    public ItemDeVenda(int quantidade, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto produto(){
        return this.produto;
    }
    public int quantidade(){
        return this.quantidade;
    }
    
    public double subTotal(){
        return this.produto.valor() * this.quantidade;
    }
    
}
