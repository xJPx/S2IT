package br.com.s2it.util;

public class GerarInteiro {

	private static final int VALOR_MAXIMO_DE_C = 1000000;

	private static final int VALOR_DEFAULT_C_INVALIDO = -1;

	public int gerarInteiroC(int inteiroA, int inteiroB) {
		String[] aQuebrado = String.valueOf(inteiroA).split("");
		String[] bQuebrado = String.valueOf(inteiroB).split("");

		int maiorLenght = recuperarMaiorIndice(aQuebrado, bQuebrado);

		int inteiroC = montarValorC(aQuebrado, bQuebrado, maiorLenght);

		return validarValorDeC(inteiroC);
	}

	private int recuperarMaiorIndice(String[] aQuebrado, String[] bQuebrado) {
		return aQuebrado.length > bQuebrado.length ? aQuebrado.length : bQuebrado.length;
	}

	private int montarValorC(String[] aQuebrado, String[] bQuebrado, int maiorLenght) {
		StringBuilder valorC = new StringBuilder();
		int index = 0;

		for (; index < maiorLenght; index++) {
			if (aQuebrado.length > index)
				valorC.append(aQuebrado[index]);

			if (bQuebrado.length > index)
				valorC.append(bQuebrado[index]);
		}

		return Integer.parseInt(valorC.toString());
	}

	private int validarValorDeC(int inteiroC) {
		return inteiroC > VALOR_MAXIMO_DE_C ? VALOR_DEFAULT_C_INVALIDO : inteiroC;
	}

}
