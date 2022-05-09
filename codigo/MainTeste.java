
public class MainTeste {

    public static void main(String args[]) {

        //int capacidadeAEscolher; ta sendo passado por j(ele fica aumentando) Mas é so trocar o nome
        int quantItems;
       
        //int contadorTempo = 0;
        int j = 5; //pra n ficar de 5 em 5  MAS se der erro VOLTA PRA 1(n acho q vai precisar)
        long tempoExecucao;
        //----------------------------------------------------
        do { //so pra testar em 1s
            System.out.println("criando uma nova mochila com capacidade :"+j+" e um novo vetor de :"+j+" itens");
            // mochila m = new mochila(capacidadeAEscolher);
            mochila m = new mochila(j);
            quantItems = j;
            ItemMochila[] item = new ItemMochila[quantItems];

            // instanciar cada item
            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }
            
            //item = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);  ********
            item = UtilLs.geraVetor(quantItems, false, j);
            int tam = item.length;// pra usar no quicksort
            // item=UtilLs.geraVetor(4, false, 10);
            // testando(pode apagar esse for)
            // for (int i = 0; i < item.length; i++) {
            // System.out.println("peso [" + i + "]: " + item[i].getPeso());
            // System.out.println("valor [" + i + "]: " + item[i].getValor());
            // System.out.println("razao : " + item[i].getRazao());
            // }


             tempoExecucao=System.currentTimeMillis(); //dps declara ele la em cima
             UtilLs.bolhaInvertido(item);
            //UtilLs.quicksort(item, 0, tam - 1); // tem q ser tam-1 se n n pega

            System.out.println("\niten(s) adicionado(s) na mochila :");
            for (int index = 0; index < item.length; index++) {
                m.adicionar(item[index]);
            }

            System.out.println();
            // imprimir os intens que estao na mochila
            m.getListaDeItens().forEach(System.out::println);

            tempoExecucao=(System.currentTimeMillis()-tempoExecucao);//n lembro se no lugar de millis é tempoFinal e se teria uma outra varivavel(desse jeito)chamada tempoInicial
            if(tempoExecucao>100){
                System.out.println("ha ha hateste ");
            }
            
            System.out.println("tempo em milisegundos ="+tempoExecucao); // prints a Unix timestamp in milliseconds
            //System.out.println("tempo em seg ="+tempoExecucao / 1000); // prints the same Unix timestamp in seconds
            j=j+100; //pode ao invez de fazer os itens crescenrem de 1 em 1 pode ser de 5 em 5
        
        
        
        
        
             //ao invez de j ser pra qtdItens e capacidadeM faz um L(aumentando de 50 em 50) pra capacidade
                //ai esse j seria a resposta da letra a
            }while(j<26000); //Perto de 25000 ja leva 4s(com o bolha)
        //while(j<100000);
        //while (tempoExecucao < 800);
    }
}
