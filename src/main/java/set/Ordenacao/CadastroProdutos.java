package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }


    public void adicionarProdutos(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProdutos( 1L,"Produto 1", 15d, 5);
        cadastroProdutos.adicionarProdutos( 2L,"Produto 2", 20d, 10);
        cadastroProdutos.adicionarProdutos( 1L,"Produto 3", 10d, 2);
        cadastroProdutos.adicionarProdutos( 9L,"Produto 4", 2d, 2);

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
