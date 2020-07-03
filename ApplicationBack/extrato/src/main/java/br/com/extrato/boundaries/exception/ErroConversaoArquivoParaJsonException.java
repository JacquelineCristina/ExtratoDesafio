package br.com.extrato.boundaries.exception;

public class ErroConversaoArquivoParaJsonException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroConversaoArquivoParaJsonException(String mensagem) {
		super(mensagem);
	}
}
