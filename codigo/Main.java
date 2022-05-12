import java.util.Arrays;

public class Main {

  public static void main(String args[]) {
    int capacidadeAEscolher = 10;
    int quantItems = 4;
    // mochila m = new mochila(capacidadeAEscolher);

    ItemMochila[] item = new ItemMochila[quantItems];

   
    for (int i = 0; i < item.length; i++) {
      item[i] = new ItemMochila();
    }

    //item = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);
    
    item = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);
    long pesoTotal = Arrays.stream(item).mapToInt(x->x.getPeso()).sum();
    long capacidadeCalculada = pesoTotal/3;

      mochila m = new mochila(capacidadeAEscolher);

    int tam=item.length;
    
    for (int i = 0; i < item.length; i++) {
      System.out.println("peso [" + i + "]: " + item[i].getPeso());
      System.out.println("valor [" + i + "]: " + item[i].getValor());
      System.out.println("razao : " + item[i].getRazao());
    }

   // UtilLs.bolhaInvertido(item);
    UtilLs.quicksort(item, 0, tam-1); 

    // System.out.println("\niten(s) adicionado(s) na mochila :");
    // for (int index = 0; index < item.length; index++) {
    //   m.adicionar(item[index]);
    // }
    int index=0;
    while(  m.adicionar(item[index])){ //ele vai tentar adicioonar item por item pra n tentar os outros
       index++;
    }
    
   
    System.out.println();
    //imprimir os intens que estao na mochila
    m.getListaDeItens().forEach(System.out::println);
    


  }
}
