import java.util.Random;

public class UtilLs {
	static void trocar(ItemMochila[] dados, int pos1, int pos2) {
		ItemMochila aux = dados[pos1];
		dados[pos1] = dados[pos2];
		dados[pos2] = aux;
	}

	static public ItemMochila[] geraVetor(int qtdItems, boolean ordenado, int capacidade) {
		Random sorteio = new Random(42);
		int somaPeso = 0;
		ItemMochila[] dados = new ItemMochila[qtdItems];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = new ItemMochila();
		}

		for (int i = 0; i < dados.length; i++) {

			dados[i].setValor((i + 2) * 5);
			somaPeso += dados[i].getPeso();
			dados[i].setPeso((i + 1) * 2);
			

			if (somaPeso >= capacidade * 3) {
				i = dados.length;
			}
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

	static public void bolha(ItemMochila[] dados) {
		for (int i = dados.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (dados[j].getRazao() > dados[j + 1].getRazao())
					trocar(dados, j, j + 1);
			}

		}
	}

	static public void bolhaInvertido(ItemMochila[] dados) {
		for (int i = dados.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (dados[j].getRazao() < dados[j + 1].getRazao())
					trocar(dados, j, j + 1);
			}

		}
	}

	static public int particao(ItemMochila[] dados, int inicio, int fim) {
		int posicao = inicio - 1;
		double pivot = dados[fim].getRazao();
		for (int i = inicio; i < fim; i++) {
			if (dados[i].getRazao() > pivot) {
				posicao++;
				trocar(dados, posicao, i);
			}
		}
		posicao++;
		trocar(dados, posicao, fim);
		return posicao;
	}

	static public void quicksort(ItemMochila[] dados, int inicio, int fim) {
		if (inicio >= fim)
			return;
		else {
			int particao = particao(dados, inicio, fim);
			quicksort(dados, inicio, particao - 1);
			quicksort(dados, particao + 1, fim);
		}
	}

}
