
public class MainTeste {

    public static void main(String args[]) {

        int capacidade;
        int quantItems;
        int j = 5;
        long tempoExecucao;

        do {

            System.out.println(" mochila com capacidade :" + j + " e :" + j + " itens");
            capacidade = j;
            mochila m = new mochila(capacidade);
            quantItems = j;
            ItemMochila[] item = new ItemMochila[quantItems];

            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }

            item = UtilLs.geraVetor(quantItems, false, capacidade); 
            int tam = item.length;// pra usar no quicksort
            

            tempoExecucao = System.currentTimeMillis();
            //UtilLs.bolhaInvertido(item);
             UtilLs.quicksort(item, 0, tam - 1);

            System.out.println("\niten(s) adicionado(s) na mochila :");
            for (int index = 0; index < item.length; index++) {
                m.adicionar(item[index]);
            }

            System.out.println();
          

            tempoExecucao = (System.currentTimeMillis() - tempoExecucao);

           

            System.out.println("tempo em milisegundos =" + tempoExecucao);

             j=j+500000; //quick
            //j = j + 2000; //bubble

        } while (tempoExecucao < 4000);

    }
}
