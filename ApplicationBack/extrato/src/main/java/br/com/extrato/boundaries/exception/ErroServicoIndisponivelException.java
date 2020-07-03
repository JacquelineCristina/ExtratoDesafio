package br.com.extrato.boundaries.exception;

public class ErroServicoIndisponivelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroServicoIndisponivelException(String mensagem) {
		super(mensagem);
	}
}
