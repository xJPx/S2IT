package br.com.s2it;

import br.com.s2it.util.GerarInteiro;

public class GeradorInteiros {

	public static void main(String[] args) {
		try {
			int inteiroA = Integer.parseInt(args[0]);
			int inteiroB = Integer.parseInt(args[1]);

			GerarInteiro gerador = new GerarInteiro();
			System.out.println(gerador.gerarInteiroC(inteiroA, inteiroB));
		} catch (NumberFormatException e) {
			System.out.println("Os argumentos devem ser Inteiros.");
		}

	}

}
