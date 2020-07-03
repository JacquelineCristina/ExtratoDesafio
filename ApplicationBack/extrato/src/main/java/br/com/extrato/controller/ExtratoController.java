package br.com.extrato.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.extrato.usecase.ConsultaExtrato;

@RestController
public class ExtratoController {

	@Autowired
	private ConsultaExtrato consultaExtrato;
	
	@CrossOrigin
	@RequestMapping(value = "/extrato", method = RequestMethod.GET)
	public ResponseEntity<?> consultarExtratoLancamento() throws IOException {
		return ResponseEntity.ok(consultaExtrato.executa());
	}
}
