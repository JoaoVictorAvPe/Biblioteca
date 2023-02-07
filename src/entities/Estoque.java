package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	List<Livro> estoqueList = new ArrayList<>();
	
	public Estoque() {
	}
	
	public void cadastrarLivro(Livro livro) {
		estoqueList.add(livro);
	}
	
	public Livro acharLivro(int registro) {
		Livro resultado = null;
		for(Livro livro : estoqueList) {
			if (livro.getRegistro() == registro) {
				resultado = livro;
				break;
			}
		}
		return resultado;
	}
	
	public double valorInventario() {
		double resultado = 0.0;
		for (Livro livro : estoqueList) {
			resultado += livro.getValor();
		}
		return resultado;
	}
}
