package br.com.franca.test;

public class Utilidades {

	public static int retornarIndiceDoMaiorValorDoVetor(int[] array) {

		if (array == null || array.length == 0)
			return -1;

		int maiorIndice = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > array[maiorIndice]) {
				maiorIndice = i;
			}
		}
		return maiorIndice;
	}

	public static int[] ordenaDeFormaDecrescenteVetor(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {
					int tempMenor = array[i];
					array[i] = array[j];
					array[j] = tempMenor;
				}
			}
		}
		return array;
	}

}
