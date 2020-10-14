package com.aplicacao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aplicacao.model.CondicaoPagamento;
import com.aplicacao.model.Parcela;


@Service
public class ProdutoServiceImpl implements ProdutoService{
	private static final Double TAXA_JUROS_SELIC_MES = 1.15;

	public List<Parcela> getListaDeParcela(Double valorProduto, CondicaoPagamento condicaoPagamento) throws Exception{
		List<Parcela> listaDeParcela = new ArrayList<Parcela>();

		for(int i=1; i<=condicaoPagamento.getQtdParcelas(); i++){
			Parcela parcela = new Parcela();
			parcela.setNumeroParcela(i);
			parcela.setTaxaJurosAoMes(condicaoPagamento.getQtdParcelas().intValue() > 6 ? TAXA_JUROS_SELIC_MES : 0.0);
			parcela.setValor((valorProduto - condicaoPagamento.getValorEntrada())/condicaoPagamento.getQtdParcelas());

			listaDeParcela.add(parcela);

		}

		return listaDeParcela;
	}

}
