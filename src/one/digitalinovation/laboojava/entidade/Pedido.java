package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;



/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um cliente.
 * @author thiago leite
 */
public class Pedido {

    //Atributos da classe Pedidos
    private String codigo;

    private Cliente cliente;

    private List<Produto> produto;

    private double total;


    //Construtor do Objeto Pedido
    public Pedido(){

        this.produto = new ArrayList<>();

    }


    //Getter and Setters dos atributos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente clientes) {
        this.cliente = clientes;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private String getProdutosComprados(){
        StringBuilder produtos = new StringBuilder();
        produtos.append("[");
        for(Produto produto : getProduto()) {
            produtos.append(produto.toString());
            produtos.append("Qtd:");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");
        return produtos.toString();
    }

    @Override
    public String toString() {
        return "Pedido [codigo=" + codigo + 
        ", cliente=" + cliente + 
        ", produto=" + getProdutosComprados() + 
        ", total=" + total + "]";
    }


    
   
}
