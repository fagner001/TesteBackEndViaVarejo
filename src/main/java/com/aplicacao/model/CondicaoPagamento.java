package com.aplicacao.model;

import java.io.Serializable;

public class CondicaoPagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double valorEntrada;
	private Integer qtdeParcelas;

	public Double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public Integer getQtdeParcelas() {
		return qtdeParcelas;
	}
	public void setQtdParcelas(Integer qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}


}
