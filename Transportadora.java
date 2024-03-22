import java.util.ArrayList;
import Veiculo;

public class Transportadora {
	private String nome;
	private String cnpj;
	private ArrayList<Veiculo> listaDeVeiculos;
	private ArrayList<Motorista> listaDeMotoristas;
	
	
	public Transportadora() {
		listaDeVeiculos = new ArrayList<Veiculo>();
		listaDeMotoristas = new ArrayList<Motorista>();
	}
	
	public void addVeiculo(Veiculo veiculo) {
		listaDeVeiculos.add(veiculo);
	}
	
	public void removeVeiculo(Veiculo veiculo) {
		listaDeVeiculos.remove(veiculo);
	}
	
	public void addMotorista(Motorista motorista) {
		this.listaDeMotoristas.add(motorista);
	}
	
	public void removeMotorista(Motorista motorista) {
		this.listaDeMotoristas.remove(motorista);
	}
	
	public String toString() {
		String result = "\nTransportadora: " + this.nome;
		for (int i=0; i<listaDeVeiculos.size(); i++)
			result += listaDeVeiculos.get(i);
		for (int i=0; i<listaDeMotoristas.size(); i++)
			result += listaDeMotoristas.get(i);		
		return result;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
