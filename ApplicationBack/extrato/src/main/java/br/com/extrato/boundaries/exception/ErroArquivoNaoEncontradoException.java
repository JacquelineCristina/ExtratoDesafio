package br.com.extrato.boundaries.exception;

public class ErroArquivoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroArquivoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
}
