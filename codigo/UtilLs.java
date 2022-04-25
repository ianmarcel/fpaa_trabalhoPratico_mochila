//import java.util.Random;

public class  UtilLs {
    static void trocar(ItemMochila[] dados, int pos1, int pos2) {
		ItemMochila aux = dados[pos1];
		dados[pos1] = dados[pos2];
		dados[pos2] = aux;
	}

	//static public double[] geraVetor(int tamanho, boolean ordenado) {
	//	Random sorteio = new Random(42);
	//	ItemMochila[] dados = new ItemMochila[tamanho];
	//	for (int i = 0; i < dados.length; i++) {
	//		dados[i].setRazao(razao); = i + 1;
	//	}
	// 	if (!ordenado) {
	// 		for (int i = 0; i < dados.length * 3; i++) {
	// 			int pos1 = sorteio.nextInt(dados.length);
	// 			int pos2 = sorteio.nextInt(dados.length);
	// 			trocar(dados, pos1, pos2);
	// 		}
	// 	}
	// 	return dados;
	// }
	
	static public void bolha(ItemMochila[] dados) { //Mudar pra ItemMochila
		for (int i = dados.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (dados[j].getRazao() > dados[j + 1].getRazao()) //ao invez de compara so dados ia ser dados[j].getRazao
					trocar(dados, j, j + 1);
			}

		}
	}
	static public void bolhaInvertido(ItemMochila[] dados) { //Mudar pra ItemMochila
		for (int i = dados.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (dados[j].getRazao() < dados[j + 1].getRazao()) //ao invez de compara so dados ia ser dados[j].getRazao
					trocar(dados, j, j + 1);
			}

		}
	}

	//testar com os valores do pdf primeiro(criamos 5 itens)
	//criamos um vetor com 5 itens e ignoramos por enquanto o itemMochila q dps é facil
	public int[] geradorDeItens(int capacidade, int quantidadeDeItens) {
		return null;
        
	}
}
