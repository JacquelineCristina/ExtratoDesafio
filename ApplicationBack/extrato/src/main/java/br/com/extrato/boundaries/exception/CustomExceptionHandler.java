package br.com.extrato.boundaries.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.extrato.boundaries.exception.model.Erro;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ErroServicoIndisponivelException.class)
	public final ResponseEntity<Erro> trataErroServicoIndisponivel() {
		return new ResponseEntity<>(new Erro("", "Serviço Indisponível"), HttpStatus.SERVICE_UNAVAILABLE);
	}

	@ExceptionHandler(ErroConversaoArquivoParaJsonException.class)
	public final ResponseEntity<Erro> tratarConversaoArquivo() {
		return new ResponseEntity<>(new Erro("", "Ocorreu um Erro durante a leitura do extrato"),
				HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Erro> tratarErroGenerico() {
		return new ResponseEntity<>(new Erro("", "Ocorreu um Erro para consultar o Extrato, tente novamente"),
				HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ErroArquivoNaoEncontradoException.class)
	public final ResponseEntity<Erro> tratarErroArquivoNaoEncontrado() {
		return new ResponseEntity<>(new Erro("", "Ocorreu um Erro para consultar o Extrato, tente novamente"),
				HttpStatus.NOT_FOUND);
	}
}
