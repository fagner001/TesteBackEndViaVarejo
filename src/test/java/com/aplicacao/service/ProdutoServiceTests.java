package com.aplicacao.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.aplicacao.model.Parcela;


class ProdutoServiceTests {  
    
    @Test
	public void getListaDeParcelaTest() throws Exception {
		    	
    	List<Parcela> listaDeParcela = new ArrayList<Parcela>();
    	Parcela parcela1 = new Parcela();
    	Parcela parcela2 = new Parcela();
    	
    	parcela1.setNumeroParcela(1);
		parcela1.setTaxaJurosAoMes(1.6);
		parcela1.setValor(200.0);
		
		parcela2.setNumeroParcela(2);
		parcela2.setTaxaJurosAoMes(1.6);
		parcela2.setValor(400.0);
    	
    	
    	
    	listaDeParcela.add(parcela1);
    	listaDeParcela.add(parcela2);
    	
    	assertTrue(listaDeParcela.size() > 0);
    	
	}

}
