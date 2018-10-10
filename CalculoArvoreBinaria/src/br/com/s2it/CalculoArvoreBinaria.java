package br.com.s2it;

import br.com.s2it.arvore.ArvoreFactory;
import br.com.s2it.arvore.SumBinaryTree;

public class CalculoArvoreBinaria {

	public static void main(String[] args) {
		ArvoreFactory fabrica = new ArvoreFactory();
		SumBinaryTree sumBinaryTree = new SumBinaryTree();
		System.out.println(sumBinaryTree.somarNosDaArvore(fabrica.gerarFloresta()));
	}

}
