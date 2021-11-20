package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 16/11/2021, 10:03:51
 */
public class Venda {

    private List<ItemDeVenda> itens = new ArrayList<>();
//    private LocalDate criadaEm = LocalDate.now();  //não utilizado
    private String cupomDesconto;

    public void adicionar(int quantidade,Produto produto) {
        //criar o item de venda
        ItemDeVenda item = new ItemDeVenda(
            quantidade,produto
        );
        this.adicionar(item);
    }

    double valorTotal() {
        double soma = 0;
        soma = itens.stream()
            .map(item -> item.subTotal())
            .reduce(soma,(accumulator,_item) -> accumulator + _item);
//            double valor = item.produto().valor();
//            int quantidade = item.quantidade();
//            soma += valor*quantidade;
        return soma;
    }

    public void adicionar(ItemDeVenda item){ 
        //adicionar o item criado à lista 
        // verificar se ele já existe na lista de itens
        if (!itens.contains(item)) {
            itens.add(item);
        }
    }
    
    //validar a data da compra
//    public boolean validarCompra(){
//        return criadaEm.isBefore(
//            LocalDate.now()
//        );
//    }
//    public void remover(ItemDeVenda item){ 
//    }
}

/*


Por exemplo, um objeto Venda tem a responsabilidade de criar linha de detalhe (fazer algo) 
e de saber sua data (conhecer algo). A seguir, apresentaremos alguns dos padrões GRASP

 */
