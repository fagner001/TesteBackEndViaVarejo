package com.aplicacao.service;

import java.util.List;

import com.aplicacao.model.CondicaoPagamento;
import com.aplicacao.model.Parcela;



public interface ProdutoService{
	public List<Parcela> getListaDeParcela(Double valorProduto, CondicaoPagamento condicaoPagamento) throws Exception;

}
