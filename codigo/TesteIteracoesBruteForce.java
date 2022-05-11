import java.util.ArrayList;

public class TesteIteracoesBruteForce {
	public static void main(String args[]) {
		for (int k = 0; k < 500; k++) {
			
			int capacidadeAEscolher = k;
			int quantItems = k;
			
			ItemMochila[] ListaDeitens = new ItemMochila[quantItems];
			for (int i = 0; i < ListaDeitens.length; i++) {
				ListaDeitens[i] = new ItemMochila();
			}
			
			ListaDeitens = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);
			
			int vetorValores[] = new int[ListaDeitens.length];
			for (int i = 0; i < ListaDeitens.length; i++) {
				vetorValores[i] = ListaDeitens[i].getValor();
				//System.out.println(" valor :["+i+"] =" + vetorValores[i]);
			}
			
			int vetorPesos[] = new int[ListaDeitens.length];
			for (int i = 0; i < ListaDeitens.length; i++) {
				vetorPesos[i] = ListaDeitens[i].getPeso();
				//System.out.println(" peso :["+i+"] ="  + vetorPesos[i]);
			}
			
			int capacidade = capacidadeAEscolher;
			int tam = vetorValores.length;
			System.out.println(ForcaBruta.forcaBruta(capacidade, vetorPesos, vetorValores, tam));
    }
}
}
