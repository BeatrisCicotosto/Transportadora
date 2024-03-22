import tipoVeiculo;
import capacidadeCarga;

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
		this.tipoVeiculo = tipoveiculo;
	}

	public String toString() {
		return "Placa: " + this.placa +
			   "\nModelo: " + this.modelo;
			   "\nMarca: " + this.marca +
			   "\nAno: " + this.ano;
	}
}
