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

    static int forcaBruta(int capacidade, ItemMochila vetorItem[], int tam) {

        if (tam == 0 || capacidade == 0) {
            return 0;
        }

        if (vetorItem[tam - 1].getPeso() > capacidade) {
            return forcaBruta(capacidade,vetorItem, tam - 1);
        }

        else {
            return valorMaior(vetorItem[tam - 1].getValor()
                    + forcaBruta(capacidade - vetorItem[tam - 1].getPeso(), vetorItem,
                    tam - 1),
                    forcaBruta(capacidade, vetorItem, tam - 1));
        }
    }

    public static void main(String args[]) {
        int capacidade  = 200;
        int quantItems  = 5;
        //int j = 20 * capacidade; ///qtdItens
        //int k = 100; //capacidade 
        long tempoExecucao;

        do {

            System.out.println(" mochila com capacidade :" + capacidade + " e :" + quantItems + " itens");
            // capacidade = j; 
            //capacidade = k;
            mochila m = new mochila(capacidade);
           // quantItems = j;
            ItemMochila[] item = new ItemMochila[quantItems];

            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }

            item = UtilLs.geraVetor(quantItems, false, capacidade); 
            int tam = item.length;// pra usar no quicksort
            

            tempoExecucao = System.currentTimeMillis();
            //UtilLs.bolhaInvertido(item);
             //UtilLs.quicksort(item, 0, tam - 1);

            System.out.println("\niten(s) adicionado(s) na mochila :");
            // for (int index = 0; index < item.length; index++) {
            //     m.adicionar(item[index]);
            // }

            ForcaBrutaTeste.forcaBruta(capacidade, item, tam);

            System.out.println();
          

            tempoExecucao = (System.currentTimeMillis() - tempoExecucao);

           

            System.out.println("tempo em milisegundos =" + tempoExecucao);

              // j=j+500000; //quick
             quantItems ++;
            //j = j + 2000; //bubble

        } while (tempoExecucao < 4000);



    //     int capacidadeAEscolher;
    //     int quantItems;
    //     int j=0;
    //     long tempoExecucao;
      
    //     do{
    //     System.out.println(" Criando mochila com capacidade :"+j+" e :"+j+" itens");
    //     quantItems = j;
    //     capacidadeAEscolher=j;
    //     ItemMochila[] ListaDeitens = new ItemMochila[quantItems];
    //     for (int i = 0; i < ListaDeitens.length; i++) {
    //         ListaDeitens[i] = new ItemMochila();
    //     }

    //     ListaDeitens = UtilLs.geraVetor(quantItems, false, j);
        

    //     int vetorValores[] = new int[ListaDeitens.length]; 

    //     for (int i = 0; i < ListaDeitens.length; i++) {
    //         vetorValores[i]=ListaDeitens[i].getValor();
           
    //     }
        

    //     int vetorPesos[] = new int[ListaDeitens.length];
    //     for (int i = 0; i < ListaDeitens.length; i++) {
    //         vetorPesos[i]=ListaDeitens[i].getPeso();
    //     }
        
    //     int capacidade = capacidadeAEscolher; 
    
    //     int tam =vetorValores.length;



    //     tempoExecucao=System.currentTimeMillis();
    //     System.out.println(forcaBruta(capacidade, vetorPesos, vetorValores, tam));
    //     tempoExecucao=(System.currentTimeMillis()-tempoExecucao);
        
        
         
    //     System.out.println();
    //     System.out.println("tempo em milisegundos ="+tempoExecucao);
    //     j = j+25;

    // }while(tempoExecucao<4000);

     
    }
}