
public class MainTeste {

    public static void main(String args[]) {

        int capacidade;
        int quantItems;
        int j = 5;
        long tempoExecucao;

        do {

            System.out.println(" mochila com capacidade :" + j + " e :" + j + " itens");
            capacidade = j;
            mochila m = new mochila(capacidade);// tava j
            quantItems = j;
            ItemMochila[] item = new ItemMochila[quantItems];

            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }

            item = UtilLs.geraVetor(quantItems, false, capacidade); // tava j
            int tam = item.length;// pra usar no quicksort
            // item=UtilLs.geraVetor(4, false, 10);
            // testando(pode apagar esse for)
            // for (int i = 0; i < item.length; i++) {
            // System.out.println("peso [" + i + "]: " + item[i].getPeso());
            // System.out.println("valor [" + i + "]: " + item[i].getValor());
            // System.out.println("razao : " + item[i].getRazao());
            // }

            tempoExecucao = System.currentTimeMillis();
            UtilLs.bolhaInvertido(item);
            // UtilLs.quicksort(item, 0, tam - 1);

            System.out.println("\niten(s) adicionado(s) na mochila :");
            for (int index = 0; index < item.length; index++) {
                m.adicionar(item[index]);
            }

            System.out.println();
            // imprimir os intens da mochila *************************
            // m.getListaDeItens().forEach(System.out::println);

            tempoExecucao = (System.currentTimeMillis() - tempoExecucao);

            if (tempoExecucao > 100) {
                // System.out.println("ha ha hateste ");
            }

            System.out.println("tempo em milisegundos =" + tempoExecucao);

            // quick : j=j+500000;
            j = j + 2000; // bubble tem q ser 1000 a 2000 pq 25000 ACABA

        } while (tempoExecucao < 4000);

    }
}
