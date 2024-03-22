public class main {
	public static void main(String[] args) {
		Data validadeCNH = new Data(19,3,2024);
		CNH cnh1 = new CNH("125476467", Categoria.A, validadeCNH);
		cnh1.exibirCNH();

        Cliente  cliente1  = new Cliente ("Jessica", "12788663776", "998771356,", "Rua XV, 12, Centro, Maringa, PR", "girafa12@gmail.com", "Geladeira");

		Endereco endereco1 = new Endereco("Rua Piu XII", 12, "Centro", "Londrina", "PR", 86010070);

		Motorista motorista1 = new Motorista("João", "123456789", endereco1, cnh1);

        System.out.println("Informações do Cliente:");
        System.out.println(cliente1.toString());

        cliente1.editarCliente("Josias", "12788663776", "998771356,", "Rua XVX, 21, Centro, Maringa, PR", "girafa12@gmail.com", "Jogo de facas");
        
        System.out.printl("Novas informações do Cliente");
        System.out.printl(cliente1.toString());
        //cliente1.excluirCliente();
        //cliente1.toString();

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

		Veiculo veiculo1 = new Veiculo("Uno", "22HT67A", "Fiat", 2010, tipoVeiculo.CARRO);

        Produto produto1 = new produto("5543876", "R$350,00", 1, "Grande", "Jessica", "Rua XV, 12, Centro, Maringa, PR");

		Transportadora transportadora1 = new Transportadora("Correio", "34.555.022/0001-10");

		System.out.println("Informações do Veículo:");
        System.out.println(veiculo1.toString());

		veiculo1.editarVeiculo("Mobi", "56KE01D", "Fiat", 2018, tipoVeiculo.CARRO);

        System.out.println("Novas informações do Veículo:");
        System.out.println(veiculo1.toString());
		//veiculo1.excluirVeiculo();
		//veiculo1.toString();

        System.out.println("Informações do Produto");
        System.out.println(produto1.toString());

        produto1.editarProduto("5544876", "R$400,00", 1, "Pequeno", "Jessica", "Rua XV, 15, Centro, Maringa, PR");

        System.out.println("Novas informações do Produto");
        System.out.println(produto1.toString());
        //produto1.excluirProduto();
        //produto1.toString();
        
		System.out.println("Informações da Transportadora:");
		System.out.println(transportadora1.toString());

		transportadora1.editarTransportadora("Express Transporte", "88.332.430/0002-09");

		System.out.println("Novas informações da Transportadora:");
		System.out.println(transportadora1.toString());
		//transportadora1.excluirTransportadora();
		//transportadora1.toString();
	}

}

