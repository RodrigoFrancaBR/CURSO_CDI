package br.com.franca.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesTests {
	private int[] lista_1;
	private int[] lista_1_ordenada;
	private int[] lista_2;
	private int maiorValorDaLista_1;
	private int maiorValorDaLista_2;

	@Before
	public void setUp() throws Exception {
		lista_1 = new int[] { 50, 25, 30, 90, 10 };
		lista_1_ordenada = new int[] { 90, 50, 30, 25, 10 };
		maiorValorDaLista_1 = 90;
		lista_2 = new int[] { 12 };
		maiorValorDaLista_2 = 12;
	}

	@Test
	public void testretornarIndiceDoMaiorValorDoVetor() {

		int maiorIndice = 0;
		maiorIndice = Utilidades.retornarIndiceDoMaiorValorDoVetor(lista_1);
		int expected = lista_1[maiorIndice];
		int actual = maiorValorDaLista_1;
		Assert.assertEquals(expected, actual);

		Assert.assertEquals(lista_2[Utilidades.retornarIndiceDoMaiorValorDoVetor(lista_2)], maiorValorDaLista_2);
		Assert.assertEquals(Utilidades.retornarIndiceDoMaiorValorDoVetor(new int[] {}), -1);
		Assert.assertEquals(Utilidades.retornarIndiceDoMaiorValorDoVetor(null), -1);
	}

	@Test
	public void testOrdenaDeFormaDecrescente() {
		int[] vetorOrdenadoDeFormaDecrescente = Utilidades.ordenaDeFormaDecrescenteVetor(lista_1);
		Assert.assertArrayEquals(vetorOrdenadoDeFormaDecrescente, lista_1_ordenada);
		Assert.assertNull(Utilidades.ordenaDeFormaDecrescenteVetor(null));		
	}

}
