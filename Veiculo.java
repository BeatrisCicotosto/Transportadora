import TipoVeiculo;
import CapacidadeCarga;

public class Veiculo {
	String placa;
	String modelo;
	String marca;
	int ano;

	
	public Veiculo(String modelo, String placa, String marca,
	int ano, String tipoVeiculo) {
		this.modelo = modelo;
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public String toString() {
		return "Placa: " + this.placa +
			   "\nModelo: " + this.modelo;
			   "\nMarca: " + this.marca +
			   "\nAno: " + this.ano;
	}
}
