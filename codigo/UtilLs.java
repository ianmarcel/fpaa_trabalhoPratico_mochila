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
		// INSTANCIANDO
		for (int i = 0; i < dados.length; i++) {
			dados[i] = new ItemMochila();
		}

		// Descricao :Primeiro ele gera Numeros na Ordem(na ta usando o random ainda)
		for (int i = 0; i < dados.length; i++) {
			//dados[i].setPeso(i + 1); //dps volta (multiplica por 5)
			//dados[i].setValor(((i + 1) * 5)); //com 1 pega
			dados[i].setValor((i+1)*5);
			somaPeso += dados[i].getPeso();
			//dados[i].setValor(((i + 1) * 4)); //com 5 pega
			dados[i].setPeso((i+1)*2);

			
			//System.out.println("soma peso = :" + somaPeso);

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
