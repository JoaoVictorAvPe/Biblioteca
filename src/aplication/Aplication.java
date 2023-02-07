package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;
import entities.Livro;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Biblioteca do Jao");
		Estoque est = new Estoque();
		
		byte resp;
		do {
			System.out.println("\n1) Cadastrar Item\n2) Consultar Item\n3) Inventario\n4) Sair");
			resp = sc.nextByte();
			
			if (resp == 1) {
				System.out.print("Codigo de registro: ");
				int registro = sc.nextInt();
				System.out.print("Autor: ");
				String autor = sc.next();
				System.out.print("Titulo: ");
				String titulo = sc.next();
				System.out.print("Editora: ");
				String editora = sc.next();
				System.out.print("Ano: ");
				int ano = sc.nextInt();
				System.out.print("Quantidade em estoque: ");
				int qtd = sc.nextInt();
				System.out.print("Valor: ");
				double valor = sc.nextDouble();
				est.cadastrarLivro(new Livro(registro, autor, titulo, editora, ano, qtd, valor));
				System.out.println(titulo + " foi cadastrado com sucesso");
			}
			
			if (resp == 2) {
				System.out.print("Digite o codigo de registro do livro: ");
				Livro livroEncontrado = est.acharLivro(sc.nextInt());
				if (livroEncontrado != null) {
					System.out.println(livroEncontrado);
				} else {
					System.out.println("Livro nao encontrado");
				}
			}
			
			if (resp == 3) {
				System.out.println("\nValor do inventario: " + est.valorInventario());
			}
			
			
		} while (resp < 4);
		
		sc.close();
	}

}
