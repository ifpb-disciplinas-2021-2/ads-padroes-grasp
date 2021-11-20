
package br.edu.ifpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {
    
    @Test
    public void testAdicionar() {    
        Produto produto = new Produto("café",6.0);
        Venda venda = new Venda();
        venda.adicionar(1,produto); //implicita
        double esperado = 6.0;
        double total = venda.valorTotal();
        assertEquals(esperado,total,0.0001);
    }
    @Test
    public void testAdicionarManualmente() {    
        Produto produto = new Produto("café",6.0);
        //instanciar este objeto
        ItemDeVenda item = new ItemDeVenda(1,produto); 
        Venda venda = new Venda();
        venda.adicionar(item);
        double esperado = 6.0;
        double total = venda.valorTotal();
        assertEquals(esperado,total,0.0001);
    }


    
}
