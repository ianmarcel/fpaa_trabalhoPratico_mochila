
public class ForcaBrutaLetraB {

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
        for(int j=0;j<10;j++){
    int capacidade  = 400;
    int quantItems  = 34;  //
    //int j = 20 * capacidade; ///qtdItens
    //int k = 100; //capacidade 
   

    

        //System.out.println(" mochila com capacidade :" + capacidade + " e :" + quantItems + " itens");
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
        

        
        //UtilLs.bolhaInvertido(item);
         //UtilLs.quicksort(item, 0, tam - 1);

        System.out.println("\niten(s) adicionado(s) na mochila :");
        // for (int index = 0; index < item.length; index++) {
        //     m.adicionar(item[index]);
        // }

        System.out.println(forcaBruta(capacidade, item, tam));
        //ForcaBrutaTeste.forcaBruta(capacidade, item, tam);

        
        System.out.println();
       // System.out.println(m.getValorAtual());
        }

    

       

      
    } 

}