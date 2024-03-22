import Data;
import Categoria;

public class CNH {
	private String numero;
	private Categoria categoria;
	private Data validade;
	
	public CNH(String numero, Categoria categoria, Data validade) {
		this.numero=numero;
		this.categoria=categoria;
		this.validade=validade;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Data getValidade() {
		return validade;
	}
	public void setValidade(Data validade) {
		this.validade= validade;
	}
	
	public void exibirCNH() {
        System.out.println("Número da CNH: " + numero);
        System.out.println("Categoria: " + categoria);
        System.out.print("Validade: ");
        validade.exibirData(); 
    }
	public void editarCNH(String novoNumero, Categoria novaCategoria, Data novaValidade) {
		this.numero = novoNumero;
		this.categoria = novaCategoria;
		this.validade = novaValidade;
		
	}
}

