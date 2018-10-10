package br.com.s2it.arvore;

public class SumBinaryTree {

	public int somarNosDaArvore(BinaryTree arvore) {
		int total = arvore.getValor();

		if (arvore.getLeft() != null)
			total += somarNosDaArvore(arvore.getLeft());

		if (arvore.getRight() != null)
			total += somarNosDaArvore(arvore.getRight());

		return total;
	}

}
