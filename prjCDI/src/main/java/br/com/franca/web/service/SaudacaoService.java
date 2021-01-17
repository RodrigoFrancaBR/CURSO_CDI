package br.com.franca.web.service;

import javax.inject.Inject;

import br.com.franca.business.Saudacao;
import br.com.franca.web.api.SaudacaoAPI;

public class SaudacaoService{ 
//implements SaudacaoAPI {
	
	/**
	 * Pacote com as classes que implementam a interface api
	 */
	
	@Inject
	Saudacao saudacao;

	// @Override
	public String fazerSaudacao(String nome) {
		return saudacao.saudar("Bruna");
	}
}
