package ecore;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private Integer idade;
	private String faixaEtaria;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;

		if (idade > 0 && idade < 12) {
			this.faixaEtaria = "Criança";
		} else if (idade >= 12 && idade <= 19) {
			this.faixaEtaria = "Adolescente";
		} else if (idade > 20 && idade < 65) {
			this.faixaEtaria = "Adulto";
		} else
			this.faixaEtaria = "Idoso";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaetaria) {
		this.faixaEtaria = faixaetaria;
	}

	// CRIAÇÃO DO MÉTODO IMPRIME
	public void imprime() {
		System.out.println("---------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Faixa Etária: " + faixaEtaria);
		System.out.println("---------------------------------------");
	}

	// CRIAÇÃO DO MÉTODO DE COMPARAÇÃO
	public int compareTo(Pessoa outraPessoa) {
		int x = this.idade.compareTo(outraPessoa.getIdade());
		if (x==0)
		return this.nome.compareToIgnoreCase(outraPessoa.getNome());
		else 
			return x;
	}
}
