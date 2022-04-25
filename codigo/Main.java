

public class Main {
    //É so de teste dps vamos usar o itemMochila

    public static void main(String args[]){
        System.out.println("itens adicionados na mochila");
        mochila m = new mochila();
        
        ItemMochila[] item = new   ItemMochila[5];//So trocar esse 5 pode virar um TAM
        
     //instanciar cada item
        for (int i = 0; i < item.length; i++) {
            item[i] = new ItemMochila();
        }

         item[0].setPeso(4); //tava 12
         item[0].setValor(12); //tava 4 
         item[1].setPeso(2);
         item[1].setValor(8);//tava 2
         item[2].setPeso(1);
         item[2].setValor(1);
         item[3].setPeso(4);
         item[3].setValor(8);
         item[4].setPeso(1);
         item[4].setValor(10);//tava 2
          

        UtilLs.bolhaInvertido(item);
       
            for (int index = 0; index < item.length; index++) { 
                  m.adicionar(item[index]);

            }
            m.getListaDeItens().forEach(System.out::println);


    }
}
