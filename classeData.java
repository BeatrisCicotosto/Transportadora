package classeCNH;

public class classeData {
	private int dia;
	private int mes;
	private int ano;

	public classeData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	
	public void exibirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
