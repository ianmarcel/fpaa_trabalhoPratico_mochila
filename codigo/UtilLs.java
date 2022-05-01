import java.util.Random;

public class UtilLs {
	static void trocar(ItemMochila[] dados, int pos1, int pos2) {
		ItemMochila aux = dados[pos1];
		dados[pos1] = dados[pos2]; // em teoria ele troca (mas acho q falta um getPeso)
		dados[pos2] = aux;
	}

	static public ItemMochila[] geraVetor(int qtdItems, boolean ordenado, int capacidade) {
		Random sorteio = new Random(42);
		// Random sorteioValor =new Random(10);
		mochila m = new mochila(capacidade);
		int somaPeso = 0;
		ItemMochila[] dados = new ItemMochila[qtdItems];
		// INSTANCIANDO
		for (int i = 0; i < dados.length; i++) {
			dados[i] = new ItemMochila();
		}

		// Primeiro ele gera Numeros na Ordem(na ta usando o random ainda)
		for (int i = 0; i < dados.length; i++) {
			dados[i].setPeso((i + 1) * 5);// dados[0].getPeso vai ser 1 dados[0].getPeso vai ser 2 e ai vai
			// esse *5(pra gerar de 5 em 5 é temp Pq o GeraVetor do prof gera numeros
			// pequenos(1 2 3 4 5...) e embaralha eles)
			somaPeso += dados[i].getPeso();
			dados[i].setValor(((i + 1) * 4));
			System.out.println("soma peso = :" + somaPeso);

			if (somaPeso >= capacidade * 3) {
				i = dados.length;
				// System.out.println("passou");
			}
		}
		if (!ordenado) {// DEPOIS(SEGUNDO) ELE DESORDENA ESSES PESOS(Q SAO INTEIROS MESMO TA CERTO)
			for (int i = 0; i < dados.length * 3; i++) {// esse *3 ja tava aqui no do caram
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

}
