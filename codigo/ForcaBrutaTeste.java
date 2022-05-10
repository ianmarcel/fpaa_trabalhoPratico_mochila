
class ForcaBrutaTeste {

    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns the maximum value that
    // can be put in a forcaBruta of
    // capacity W
    static int forcaBruta(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is
        // more than forcaBruta capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > W)
            return forcaBruta(W, wt, val, n - 1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return max(val[n - 1]
                    + forcaBruta(W - wt[n - 1], wt,
                            val, n - 1),
                            forcaBruta(W, wt, val, n - 1));
    }

    // PODE SEPARAR A MAIN DAQUI
    public static void main(String args[]) {
        int capacidadeAEscolher;
        int quantItems;
        int j=0;
        long tempoExecucao;
      
        do{
        //mochila m = new mochila(capacidadeAEscolher);
        System.out.println(" Criando mochila com capacidade :"+j+" e :"+j+" itens");
        quantItems = j;
        capacidadeAEscolher=j;
        ItemMochila[] ListaDeitens = new ItemMochila[quantItems];
        // instanciar cada item
        for (int i = 0; i < ListaDeitens.length; i++) {
            ListaDeitens[i] = new ItemMochila();
        }

        ListaDeitens = UtilLs.geraVetor(quantItems, false, j);
        

        // com um for simples vou criar um vetor wt q cada posicao vai receber
        //int val[] = new int[] { 60, 100, 120 }; //esse valores a mao foi do autor da internet
        int val2[] = new int[ListaDeitens.length]; //esse eh o nosso(o mesmo vale pro wt2)
        for (int i = 0; i < ListaDeitens.length; i++) {
            val2[i]=ListaDeitens[i].getValor();
            //System.out.println("Testanto o valor :"+val2[i]);
        }
         // com um for simples vou criar um vetor wt q cada posicao vai receber
        //int wt[] = new int[] { 10, 20, 30 };
        int wt2[] = new int[ListaDeitens.length];
        for (int i = 0; i < ListaDeitens.length; i++) {
            wt2[i]=ListaDeitens[i].getPeso();
            //System.out.println("Testanto o peso :"+wt2[i]);
        }
        //int W = 50; // ao invez de 50 vai ser tam pra eu passar o mochila(tam) Ou o capacidadeAEscolher(eu acho)
        int W2 = capacidadeAEscolher; //sera q j?
        //int n = val.length; //vai ser val2.lenght
        int n2 =val2.length;



        tempoExecucao=System.currentTimeMillis();
        System.out.println(forcaBruta(W2, wt2, val2, n2));
        tempoExecucao=(System.currentTimeMillis()-tempoExecucao);
        // no ultimo caso pode copiar o codigo dele e so mudar as variaves(pq tu ja tem
        // varias coisas(itemMochila,...))
        if(tempoExecucao>100){
             // System.out.println("ha ha hateste ");
          }
          System.out.println();
        System.out.println("tempo em milisegundos ="+tempoExecucao);
        j = j+25;//volta pra 50

    }//  while(j<300); //volta pra 250
     while(tempoExecucao<4000);

     //Resultado é entre 250 e 275 no MAXIMO(N passa disso)
    }
}