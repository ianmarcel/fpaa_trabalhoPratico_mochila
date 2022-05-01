
public class Main {

  public static void main(String args[]) {
    int capacidadeAEscolher = 10;
    int quantItems = 4;
    mochila m = new mochila(10);

    ItemMochila[] item = new ItemMochila[quantItems];// So trocar esse 5 pode virar um TAM

    // instanciar cada item
    for (int i = 0; i < item.length; i++) {
      item[i] = new ItemMochila();
    }

    item = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);
    // item=UtilLs.geraVetor(4, false, 10);
    // testando(pode apagar esse for)
    for (int i = 0; i < item.length; i++) {
      System.out.println("peso [" + i + "]: " + item[i].getPeso());
      System.out.println("valor [" + i + "]: " + item[i].getValor());
      System.out.println("razao : " + item[i].getRazao());
    }

    UtilLs.bolhaInvertido(item);

    for (int index = 0; index < item.length; index++) {
      m.adicionar(item[index]);
    }

  }
}
