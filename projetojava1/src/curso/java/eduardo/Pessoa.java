package curso.java.eduardo;

import java.util.Date;

import javax.xml.crypto.Data;

public class Pessoa {

	private String name;
	private String sobrenome;
	private int idade;
	private String cpf;
	private String endereco;
	private Data  dataNascimento;
	
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date dataCadastro;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
