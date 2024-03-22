import Cliente;
import Endereco;

public class Produto {

    private int id;
    private double valor;
    private int qtd;
    private int tamanho;
    private Cliente cliente;
    private Endereco endereco;

    public Produto(int id, double valor, int qtd, int tamanho, Cliente cliente, Endereco endereco){
       this.id = id;
       this.valor = valor;
       this.qtd = qtd;
       this.tamanho = tamanho;
       this.cliente = cliente;
       this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

    public int getTamanho() {
       return tamanho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;   
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirProduto() {
        System.out.println("Produto ID: " + id);
        System.out.println("Preço do produto: " + valor);
        System.out.println("Quantidade de produtos: " + qtd);
        System.out.println("Tamanho do produto: " + tamanho);
        System.out.println("Cliente: " + cliente); 
        System.out.println("Endereco: " + endereco); 
    }
    
    public void editarProduto(int novoId, double novoValor, int novoQtd, int novoTamanho, Cliente novoCliente, Endereco novoEndereco){
       this.id = novoId;
       this.valor = novoValor;
       this.qtd = novoQtd;
       this.tamanho = novoTamanho;
       this.cliente = novoCliente;
       this.endereco = novoEndereco;
    }
    
}
