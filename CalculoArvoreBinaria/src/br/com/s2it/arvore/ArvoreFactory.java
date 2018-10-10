package br.com.s2it.arvore;

import java.util.Random;

public class ArvoreFactory {

	public BinaryTree gerarFloresta() {
		BinaryTree arvore = criarArvore();
		arvore.setLeft(criarArvore());
		arvore.getLeft().setLeft(criarArvore());
		arvore.getLeft().setRight(criarArvore());
		arvore.getLeft().getLeft().setLeft(criarArvore());
		arvore.getLeft().getLeft().setRight(criarArvore());
		arvore.getLeft().getRight().setLeft(criarArvore());
		arvore.getLeft().getRight().setRight(criarArvore());

		arvore.setRight(criarArvore());
		arvore.getRight().setLeft(criarArvore());
		arvore.getRight().setRight(criarArvore());
		arvore.getRight().getLeft().setLeft(criarArvore());
		arvore.getRight().getLeft().setRight(criarArvore());
		arvore.getRight().getRight().setLeft(criarArvore());
		arvore.getRight().getRight().setRight(criarArvore());

		return arvore;
	}

	public BinaryTree criarArvore() {
		BinaryTree arvore = new BinaryTree();
		arvore.setValor(new Random().nextInt(50));

		return arvore;
	}

	public BinaryTree criarArvore(int valor) {
		BinaryTree arvore = new BinaryTree();
		arvore.setValor(valor);

		return arvore;
	}

}
