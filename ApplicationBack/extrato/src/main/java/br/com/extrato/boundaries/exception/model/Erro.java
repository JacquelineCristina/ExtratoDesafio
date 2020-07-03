package br.com.extrato.boundaries.exception.model;

public class Erro {

	private String codigo;
	private String mensagem;
	

	public Erro(String codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
