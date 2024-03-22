public class main {
	public static void main(String[] args) {
		Data validadeCNH = new Data(19,3,2024);
		CNH cnh1 = new CNH("125476467", Categoria.A, validadeCNH);
		cnh1.exibirCNH();

		Endereco endereco1 = new Endereco("Rua Piu XII", 12, "Centro", "Londrina", "PR", 86010070);

		Motorista motorista1 = new Motorista("João", "123456789", endereco1, cnh1);

		System.out.println("Informações do Endereço:");
		System.out.println(endereco1.toString());

		endereco1.editarEndereco("Rua Amazonas", 753, "Centro", "Sertanópolis", "PR", 86020160);

		System.out.println("Novas informações do Endereço:");
		System.out.println(endereco1.toString());

		System.out.println("Número do Endereço: " + endereco1.getNumero());

		endereco1.setNumero(25);

		System.out.println("Informações do Endereço após a mudança do número:");
        System.out.println(endereco1.toString());
		
		//endereco1.excluirEndereco();
		//endereco1.toString();

        System.out.println("Informações do Motorista:");
        System.out.println(motorista1.toString());

		motorista1.editarMotorista("Ana", "987654321", endereco1, cnh1);

        System.out.println("Novas informações do Motorista:");
        System.out.println(motorista1.toString());

        System.out.println("CPF do Motorista: " + motorista1.getCpf());

		motorista1.setNome("Ana Maria");

        System.out.println("Informações do Motorista após a mudança do nome:");
        System.out.println(motorista1.toString());
		//motorista1.excluirMotorista();
		//motorista1.toString();
	}

}

