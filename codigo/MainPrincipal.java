public class MainPrincipal {
    public static void main(String args[]) {

   long tempoExecucao =0;
   int capacidade=200;//esse valor mesmo(foi chute mas pode manter pra letra a)
   int quantItems=5; //esse valor mesmo(foi chute mas pode manter pra letra a)
   ItemMochila[] item = new ItemMochila[quantItems];
   mochila m = new mochila(capacidade); //verificar
   int tam;
            //instanciando
            for (int i = 0; i < item.length; i++) {
                item[i] = new ItemMochila();
            }


    

    //Letra A
   while(tempoExecucao<4000){
    System.out.println(" mochila com capacidade :" + capacidade + " e :" + quantItems + " itens");
    tempoExecucao = System.currentTimeMillis();  //inicia
    //criar o vetor de itens
    item=UtilLs.geraVetor(quantItems, false, capacidade); //ja ta ok(prof alterou)
    tam = item.length;
    System.out.println(ForcaBrutaTeste.forcaBruta(capacidade, item, tam));
    //forca bruta(n precisa do guloso)
    tempoExecucao = (System.currentTimeMillis() - tempoExecucao);
    System.out.println("tempo em milisegundos =" + tempoExecucao);
    quantItems++;
   } 
     //Letra B (ja comeca o for com esse resultado que vc descobriu)
     System.out.println("LETRA B");
     //System.out.println("Forca Bruta");
     for (int i = 0; i < 5; i++) {
         //System.out.println(" qtd de itens "+(quantItems-1));
        System.out.println("Forca Bruta");
         item=UtilLs.geraVetor((quantItems-1), false, capacidade);//com essa qtd 34
         //fazendo o forca Bruta
         tam=item.length;
         System.out.println(ForcaBrutaTeste.forcaBruta(capacidade, item, tam));
        
         //fazendo o guloso
         System.out.println("guloso");
      // UtilLs.bolhaInvertido(item);
       UtilLs.quicksort(item, 0, tam-1); 
      for (int index = 0; index < item.length; index++) {
      m.adicionar(item[index]);
      }
      System.out.println(m.getValorAtual());
      

     }
   }   
}