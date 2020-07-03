package br.com.extrato.domain.model;

import java.util.List;

public class ExtratoView {

	private int indice;

	private TotalControleLancamentoView totalControleLancamento;

	private List<ControleLancamentoView> listaControleLancamento;

	private int tamanhoPagina;
	private int totalElements;

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public TotalControleLancamentoView getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(TotalControleLancamentoView totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	public List<ControleLancamentoView> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ControleLancamentoView> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	public int getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(int tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

}
