package com.poo;

import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {

        Venda venda = new Venda();
        venda.setEnderecoEntrega("Entrega pelo email");
        venda.setDescricaoVenda("Palestra Daniel");
        venda.setId(151515L);
        venda.setNomeCliente("Daniel Santiago");

        Produto produto1 = new Produto();
        produto1.setId(1010L);
        produto1.setNomeProduto("Palestra");
        produto1.setValorProduto(BigDecimal.valueOf(100.00));

        Produto produto2 = new Produto();
        produto2.setId(10010L);
        produto2.setNomeProduto("Palestra Spring");
        produto2.setValorProduto(BigDecimal.valueOf(150.00));

        Produto produto3 = new Produto();
        produto3.setId(10010L);
        produto3.setNomeProduto("Palestra Spring");
        produto3.setValorProduto(BigDecimal.valueOf(1500.00));

        venda.getListaProdutos().add(produto1);//Não consigo fazer validações
        venda.addProduto(produto2);//Posso fazer varias validações antes de adicionar na lista
        venda.addProduto(produto3);

        System.out.println("Descicao da venda " +
                venda.getDescricaoVenda() + " e o total da venda " + venda.totalVenda());
/*


        System.out.println(venda);*/
    }
}
