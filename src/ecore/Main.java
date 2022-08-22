package ecore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	public static void main(String[] args) {

		List<Pessoa> listaPessoas = new ArrayList<>();

		System.out
				.println("-------------- BEM-VINDO AO SISTEMA DE CADASTRO DE PESSOAS DA E-CORE ---------------------");
		while (true) {

			System.out.println("Digite 1 - Cadastrar nova pessoa:");
			System.out.println("Digite 2 - Exibir lista de pessoas cadastradas:");
			System.out.println("Digite 3 - Sair do programa:");

			int opcao = Teclado.leInt("Digite a opção desejada:"); // FORMA DE ENTRADA E SAÍDA DE DADOS - CLASSE TECLADO

			if (opcao == 1) {
				System.out.println("Vamos cadastrar uma NOVA pessoa:");
				String nome = Teclado.leString("Digite o nome da pessoa: ");
				int idade = Teclado.leInt("Digite a idade da pessoa: ");

				Pessoa pessoa = new Pessoa(nome, idade);
				listaPessoas.add(pessoa);

				System.out.println("Você cadastrou a seguinte pessoa:");
				pessoa.imprime();
			} else if (opcao == 2) {
				System.out.println("Listar pessoas cadastradas:");
				Collections.sort(listaPessoas);

				for (Pessoa pessoa : listaPessoas) {
					pessoa.imprime();
				}
			} else if (opcao == 3) {
				System.out.println("Saindo do programa:");
				break;
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}

		}
	}
}
