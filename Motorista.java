import Endereco;
import CNH;

public class Motorista {

	public String nome;
	public String cpf;
	public Endereco endereco;
	public CNH cnh;

	public Motorista(String nome, String cpf, Endereco endereco, CNH cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cnh = cnh;
	}
	
	public void editarMotorista(String nome, String cpf, Endereco endereco, CNH cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cnh = cnh;
	}
	
	public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public CNH getCnh() {
        return cnh;
    }

	public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) { // Verifica se o nome não é nulo e não está vazio
            this.nome = nome; // Atribui o nome ao campo this.nome
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio."); // Lança exceção se o nome for inválido
        }
	}
	
    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty()) { 
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio.");
        }
    }    
	
    public void setEndereco(Endereco endereco) {
        if (endereco != null) { 
            this.endereco = endereco; 
        } else {
            throw new IllegalArgumentException("O endereço não pode ser nulo.");
        }
    }
    
	
    public void setCnh(CNH cnh) {
        if (cnh != null) {
            this.cnh = cnh; 
        } else {
            throw new IllegalArgumentException("A CNH não pode ser nula."); 
        }
    }

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + 
				"CPF: " + this.cpf + "\n" + 
				"Endereço: " + this.endereco + "\n" + 
				"CNH: " + this.cnh + "\n";
	}
	
	public void excluirMotorista() {
		this.nome = null;
		this.cpf = null;
		this.endereco = null;
		this.cnh = null;
	}
}
