package classeCNH;

public class mainCNH {
	public static void main(String[] args) {
		classeData validadeCNH = new classeData(19,3,2024);
		CNH cnh1 = new CNH("125476467", "A", validadeCNH);
		cnh1.exibirCNH();
		
	}

}
