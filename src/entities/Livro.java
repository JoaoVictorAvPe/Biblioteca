package entities;

public class Livro {
	private Integer registro;
	private String autor;
	private String titulo;
	private String editora;
	private Integer ano;
	private Integer qtd;
	private Double valor;
	
	public Livro() {
	}

	public Livro(Integer registro, String autor, String titulo, String editora, Integer ano, Integer qtd,
			Double valor) {
		this.registro = registro;
		this.autor = autor;
		this.titulo = titulo;
		this.editora = editora;
		this.ano = ano;
		this.qtd = qtd;
		this.valor = valor;
	}

	public Integer getRegistro() {
		return registro;
	}

	public void setRegistro(Integer registro) {
		this.registro = registro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "\nAutor: "+
				getAutor()+
				"\nTitulo: "+
				getTitulo()+
				"\nEditora: "+
				getEditora()+
				"\nAno: "+
				getAno()+
				"\nQuantidade: "+
				getQtd()+
				"\nValor: "+
				getValor();
	}
}
