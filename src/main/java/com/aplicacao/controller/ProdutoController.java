package com.aplicacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacao.model.CondicaoPagamento;
import com.aplicacao.model.ParametroRequisicao;
import com.aplicacao.service.ProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value="Produto")
@RequestMapping(value="/api")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;


	@SuppressWarnings("rawtypes")
	@ApiOperation(value = "Retorna a Lista de Parcelas da Compra de um Produto")
	@RequestMapping(value="/listaParcelaCompraProduto", method={RequestMethod.POST},  produces="application/json")
	ResponseEntity getListaParcelaCompraProduto(@RequestBody ParametroRequisicao parametroRequisicao) {
		try {
			Double valorProduto = parametroRequisicao.getProduto().getValor();
			CondicaoPagamento condicaoPagamento = parametroRequisicao.getCondicaoPagamento();

			return ResponseEntity.ok(produtoService.getListaDeParcela(valorProduto, condicaoPagamento));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}


}
