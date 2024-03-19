public class Endereco {
	
	public String logradouro;
	public int numero;
	public String bairro;
	public String cidade;
	public String estado;
	public int cep;

	public Endereco(String logradouro,int numero, String bairro, 
					String cidade, String estado, int cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;		
	}

    public void editarEndereco(String novoLogradouro, int novoNumero, String novoBairro, 
            					String novaCidade, String novoEstado, int novoCep) {
		this.logradouro = novoLogradouro;
		this.numero = novoNumero;
		this.bairro = novoBairro;
		this.cidade = novaCidade;
		this.estado = novoEstado;
		this.cep = novoCep;
	}
    
    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCep() {
        return cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro != null ? logradouro : "";
    }

    public void setNumero(int numero) {
        if (numero >= 0) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
    }

    public void setBairro(String bairro) {
        this.bairro = bairro != null ? bairro : "";
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade != null ? cidade : "";
    }
    
    public void setEstado(String estado) {
        this.estado = estado != null ? estado : "";
    }
    
    public void setCep(int cep) {
        if (cep >= 0) {
            this.cep = cep;
        } else {
            throw new IllegalArgumentException("O CEP não pode ser negativo.");
        }
    }    
    
	@Override
	public String toString() {
		return "Logradouro: " + this.logradouro + "\n" + 
				"Número: " + this.numero + "\n" + 
				"Bairro: " + this.bairro + "\n" + 
				"Cidade: " + this.cidade + "\n" + 
				"Estado: " + this.estado + "\n" + 
				"Cep: " + this.cep + "\n";
	}
	
	public void excluirEndereco() {
		this.logradouro = null;
		this.numero = 0;
		this.bairro = null;
		this.cidade = null;
		this.estado = null;
		this.cep = 0;
	}
	
}
