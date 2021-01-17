package br.com.franca.web.api;

import javax.inject.Inject;

import br.com.franca.business.Saudacao;

public class SaudacaoController implements SaudacaoAPI {
	/**
	 * Pacote com as classes e interfaces juntas
	 */
	
	@Inject
	Saudacao saudacao;

	@Override
	public String fazerSaudacao(String nome) {
		return saudacao.saudar(nome);
	}

}
