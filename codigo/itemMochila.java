package trabalho_mochila;

import java.util.Random;

public class itemMochila {
	private int valor;
	private int peso;

	static void trocar(int[] dados, int pos1, int pos2) {
		int aux = dados[pos1];
		dados[pos1] = dados[pos2];
		dados[pos2] = aux;
	}

	static public int[] geraVetor(int tamanho, boolean ordenado) {
		Random sorteio = new Random(42);
		int[] dados = new int[tamanho];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = i + 1;
		}
		if (!ordenado) {
			for (int i = 0; i < dados.length * 3; i++) {
				int pos1 = sorteio.nextInt(dados.length);
				int pos2 = sorteio.nextInt(dados.length);
				trocar(dados, pos1, pos2);
			}
		}
		return dados;
	}

	public int[] geradorDeItens(int capacidade, int quantidadeDeItens) {
		return null;

	}
}
