package com.aplicacao.model;

import java.io.Serializable;

public class CondicaoPagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double valorEntrada;
	private Integer qtdParcelas;

	public Double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public Integer getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(Integer qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}


}
