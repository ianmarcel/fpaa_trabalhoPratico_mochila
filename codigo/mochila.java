import java.util.List;

import trabalho_mochila.ItemMochila;

public class mochila {
    public static final int  CAPACIDADE_MAX=15;
    private int pesoAtualMochila=0;
    List<ItemMochila> listaDeitens;
    public void adicionar(ItemMochila item){
        //lembrando q esse item tem um peso(mais importante aqui) e um valor
        if(item.getPeso()+this.pesoAtualMochila < mochila.CAPACIDADE_MAX){
            this.pesoAtualMochila = pesoAtualMochila +item.getPeso();
            listaDeitens.add(item);
        }
        //talvez o metodo forca bruta tenha permutacao(nao)
    }
}
