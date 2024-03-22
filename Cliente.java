import Produto;
import Endereco;

public class Cliente {

    public String nome;
    public String cpf;
    public String telefone;
    public Endereco endereco;
    public String email;
    public Produto produto; 

    public Cliente(String nome, String cpf, String telefone, Endereco endereco, String email, Produto produto){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.produto = produto; 
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

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) { 
            this.nome = nome; 
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio."); 
        }
	}

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty()) { 
            this.cpf = cpf; 
        } else {
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio."); 
        }
	}
    
    public void setTelefone(String telefone) {
        if (telefone != null && !telefone.isEmpty()) { 
            this.telefone = telefone; 
        } else {
            throw new IllegalArgumentException("O telefone não pode ser nulo ou vazio."); 
        }
	}

   	
    public void setEndereco(Endereco endereco) {
        if (endereco != null) { 
            this.endereco = endereco; 
        } else {
            throw new IllegalArgumentException("O endereço não pode ser nulo.");
        }
    } 

    public void setEmail(String email) {
        if (email != null && !email.isEmpty()) { 
            this.email = email; 
        } else {
            throw new IllegalArgumentException("O email não pode ser nulo ou vazio."); 
        }
	}

    public void exibirCliente() {
        System.out.println(" Cliente: " + nome);
        System.out.println(" Cliente: " + cpf);
        System.out.println(" Cliente: " + endereco);
        System.out.println(" Cliente: " + telefone);
        System.out.println(" Cliente: " + email);
    }

    public void editarCliente(String novoNome, String novoCpf, Endereco novoEndereco, String novoTelefone, String novoEmail){
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.endereco= novoEndereco;
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }
}
