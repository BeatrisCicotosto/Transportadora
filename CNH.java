package classeCNH;

public class CNH {
	private String numero;
	private String categoria;
	private classeData validade;
	
	public CNH(String numero, String categoria, classeData validade) {
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public classeData getValidade() {
		return validade;
	}
	public void setValidade(classeData validade) {
		this.validade= validade;
	}
	
	public void exibirCNH() {
        System.out.println("Número da CNH: " + numero);
        System.out.println("Categoria: " + categoria);
        System.out.print("Validade: ");
        validade.exibirData(); 
    }
}
