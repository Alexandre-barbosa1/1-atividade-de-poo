package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Passaro> passaros = new ArrayList<Passaro>();
		ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
		ArrayList<Coelho> coelhos = new ArrayList<Coelho>();
		ArrayList<Gato> gatos = new ArrayList<Gato>();
		ArrayList<Peixe> peixes = new ArrayList<Peixe>();

		Menu menu = new Menu();
		menu.Listar();
		int opcao = scanner.nextInt();
		scanner.nextLine();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("Cadastre o pássaro: ");
				Passaro passaro = new Passaro();
				System.out.println("Nome: ");
				String nome = scanner.next();
				passaro.setNome(nome);
				System.out.println("Idade: ");
				int idade = scanner.nextInt();
				passaro.setIdade(idade);
				scanner.nextLine();
				System.out.println("Especie:");
				String especie = scanner.next();
				passaro.setEspecie(especie);
				System.out.println("Peso");
				double peso = scanner.nextDouble();
				passaro.setPeso(peso);
				scanner.nextLine();
				System.out.println("Genero:");
				String genero = scanner.next();
				passaro.setGenero(genero);
				passaros.add(passaro);
				break;
			case 2:
				System.out.println("Listar pássaros: ");
				break;
			case 3:
				System.out.println("Cadastre o cachorro: ");
				Cachorro cachorro = new Cachorro();
				System.out.println("Nome: ");
				nome = scanner.next();
				cachorro.setNome(nome);
				System.out.println("Idade: ");
				idade = scanner.nextInt();
				cachorro.setIdade(idade);
				scanner.nextLine();
				System.out.println("Especie:");
				especie = scanner.next();
				cachorro.setEspecie(especie);
				System.out.println("Peso");
				peso = scanner.nextDouble();
				cachorro.setPeso(peso);
				scanner.nextLine();
				System.out.println("Genero:");
				genero = scanner.next();
				cachorro.setGenero(genero);
				cachorros.add(cachorro);
				break;
			case 4:
				System.out.println("Listar cachorro");
				break;
			case 5:
				System.out.println("Cadastre o gato");
				Gato gato = new Gato();
				System.out.println("Nome: ");
				nome = scanner.next();
				gato.setNome(nome);
				System.out.println("Idade: ");
				idade = scanner.nextInt();
				gato.setIdade(idade);
				scanner.nextLine();
				System.out.println("Especie:");
				especie = scanner.next();
				gato.setEspecie(especie);
				System.out.println("Peso");
				peso = scanner.nextDouble();
				gato.setPeso(peso);
				scanner.nextLine();
				System.out.println("Genero:");
				genero = scanner.next();
				gato.setGenero(genero);
				gatos.add(gato);
				break;
			case 6:
				System.out.println("Listar gatos");
				break;
			case 7:
				System.out.println("Cadastrar o peixe");
				Peixe peixe = new Peixe();
				System.out.println("Nome: ");
				nome = scanner.next();
				peixe.setNome(nome);
				System.out.println("Idade: ");
				idade = scanner.nextInt();
				peixe.setIdade(idade);
				scanner.nextLine();
				System.out.println("Especie:");
				especie = scanner.next();
				peixe.setEspecie(especie);
				System.out.println("Peso");
				peso = scanner.nextDouble();
				peixe.setPeso(peso);
				scanner.nextLine();
				System.out.println("Genero:");
				genero = scanner.next();
				peixe.setGenero(genero);
				peixes.add(peixe);
				break;
			case 8:
				System.out.println("Listar peixes");
				break;
			case 9:
				System.out.println("Cadastrar o coelho");
				Coelho coelho = new Coelho();
				System.out.println("Nome: ");
				nome = scanner.next();
				coelho.setNome(nome);
				System.out.println("Idade: ");
				idade = scanner.nextInt();
				coelho.setIdade(idade);
				scanner.nextLine();
				System.out.println("Especie:");
				especie = scanner.next();
				coelho.setEspecie(especie);
				System.out.println("Peso");
				peso = scanner.nextDouble();
				coelho.setPeso(peso);
				scanner.nextLine();
				System.out.println("Genero:");
				genero = scanner.next();
				coelho.setGenero(genero);
				coelhos.add(coelho);
				break;
			case 10:
				System.out.println("Listar coelhos");
				break;
			}
			if (opcao > 10) {
				System.out.println("Opção inválida");
			}
			System.out.println();
			menu.Listar();
			opcao = scanner.nextInt();
		}

		scanner.close();

	}

}
