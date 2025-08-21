package main.java.list.OperacoesBasicas;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;

        for (Item item : itemList){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItems(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 5.50, 2);
        carrinho.adicionarItem("Feijão", 7.50, 2);

        System.out.printf("Valor total de compras no carrinho: R$%.2f\n", carrinho.calcularValorTotal());
        carrinho.exibirItems();
    }
}
