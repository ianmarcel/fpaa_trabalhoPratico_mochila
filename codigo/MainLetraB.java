
public class MainLetraB{

    public static void main(String args[]) {
    
    
        for(int j=0;j<500;j++){  
                                               // System.out.println("teste "+j); *****VOLTA N APAGA
        //275 é o valor encontrado por A(PODE TESTAR COM 10 SE QUISER(275 É MUITO RAPIDO TBM))
      int capacidadeAEscolher = 400;
      int quantItems = 34; //E esse valor mesmo(foi o q deu do forcaBruta)
      Mochila m = new Mochila(capacidadeAEscolher);
  
      ItemMochila[] item = new ItemMochila[quantItems];
  
      // instanciar cada item
      for (int i = 0; i < item.length; i++) {
        item[i] = new ItemMochila();
      }
  
      item = Utils.geraVetor(quantItems, false, capacidadeAEscolher);
      int tam=item.length;
      
      for (int i = 0; i < item.length; i++) {
        // System.out.println("peso [" + i + "]: " + item[i].getPeso());
        // System.out.println("valor [" + i + "]: " + item[i].getValor());
        //  System.out.println("razao : " + item[i].getRazao());
      }
  
     // UtilLs.bolhaInvertido(item);
      Guloso.quicksort(item, 0, tam-1);
  
           //System.out.println("\niten(s) adicionado(s) na mochila :");   *********VOLTA N APAGA
      for (int index = 0; index < item.length; index++) {
        m.add(item[index]);
      }
      
     
      //System.out.println();
      //imprimir os intens que estao na mochila
                             // m.getListaDeItens().forEach(System.out::println);   *****VOLTA N APAGA
            
           
           // System.out.println("valor somado :"+m.getValorAtual()); *****VOLTA N APAGA
           System.out.println(m.getValorAtual());

      

    }
  
    }
  }
  