package com.poo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Long id;
    private String descricao;
    private String nomeCliente;
    private  String enderecoEntrega;
    private BigDecimal valorTotal;

    private List<Produto> listaProdutos = new ArrayList<Produto>();

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void addProduto(Produto produto){
        //Poderia fazer varias validações antes de adicionar produtos na lista
        this.listaProdutos.add(produto);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", valorTotal=" + valorTotal +
                ", listaProdutos=" + listaProdutos +
                '}';
    }
}
