public class ForcaBrutaTeste {

    static int valorMaior(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    static int valorMaior2(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    static int forcaBruta(int capacidade, int vetorPesos[], int vetorValores[], int tam) {

        if (tam == 0 || capacidade == 0) {
            return 0;
        }

        if (vetorPesos[tam - 1] > capacidade) {
            return forcaBruta(capacidade, vetorPesos, vetorValores, tam - 1);
        }

        else {
            return valorMaior(vetorValores[tam - 1]
                    + forcaBruta(capacidade - vetorPesos[tam - 1], vetorPesos,
                            vetorValores, tam - 1),
                    forcaBruta(capacidade, vetorPesos, vetorValores, tam - 1));
        }
    }

    public static void main(String args[]) {
        int capacidadeAEscolher;
        int quantItems;
        int j=0;
        long tempoExecucao;
      
        do{
        System.out.println(" Criando mochila com capacidade :"+j+" e :"+j+" itens");
        quantItems = j;
        capacidadeAEscolher=j;
        ItemMochila[] ListaDeitens = new ItemMochila[quantItems];
        for (int i = 0; i < ListaDeitens.length; i++) {
            ListaDeitens[i] = new ItemMochila();
        }

        ListaDeitens = UtilLs.geraVetor(quantItems, false, j);
        

        int vetorValores[] = new int[ListaDeitens.length]; 
        for (int i = 0; i < ListaDeitens.length; i++) {
            vetorValores[i]=ListaDeitens[i].getValor();
           
        }
        

        int vetorPesos[] = new int[ListaDeitens.length];
        for (int i = 0; i < ListaDeitens.length; i++) {
            vetorPesos[i]=ListaDeitens[i].getPeso();
        }
        
        int capacidade = capacidadeAEscolher; 
    
        int tam =vetorValores.length;



        tempoExecucao=System.currentTimeMillis();
        System.out.println(forcaBruta(capacidade, vetorPesos, vetorValores, tam));
        tempoExecucao=(System.currentTimeMillis()-tempoExecucao);
        
        
         
        System.out.println();
        System.out.println("tempo em milisegundos ="+tempoExecucao);
        j = j+25;

    }while(tempoExecucao<4000);

     
    }
}