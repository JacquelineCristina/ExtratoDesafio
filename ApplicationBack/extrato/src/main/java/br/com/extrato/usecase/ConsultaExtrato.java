package br.com.extrato.usecase;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.extrato.domain.model.ExtratoView;

@Component
public class ConsultaExtrato {

	public ExtratoView executa() throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		
		ExtratoView extrato = mapper.readValue(converterArquivoEmJSON().toString(), ExtratoView.class);
		return extrato;
	}

	private JSONObject converterArquivoEmJSON() {
		JSONObject jsonObject = new JSONObject();
		try {
			String caminho = "src\\main\\resources\\massa\\lancamento-conta-legado.json";

			String json = String.join(" ", Files.readAllLines(Paths.get(caminho), StandardCharsets.UTF_8));
			jsonObject = new JSONObject(json);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return jsonObject;
	}
}
