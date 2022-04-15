import java.util.List;

import trabalho_mochila.ItemMochila;

public class mochila {
    public static final int  CAPACIDADE_MAX=15;//kçeyann sugeriu passar no construtor 
    private int pesoAtualMochila;
    List<ItemMochila> listaDeitens;

    //e ia chamando o adicionar dentro do for(adicionar varios itens ate estourar)
    public void adicionar(ItemMochila item){
        //lembrando q esse item tem um peso(mais importante aqui) e um valor
        if(item.getPeso()+this.pesoAtualMochila < mochila.CAPACIDADE_MAX){
            this.pesoAtualMochila = pesoAtualMochila +item.getPeso();
            listaDeitens.add(item);
        }
        //talvez o metodo forca bruta tenha permutacao(nao)
    }

    public Mochila(){
       this.pesoAtualMochila=0;
    }
    public Mochila(int capacidadeMaximaVCqueEscolher){ //por enquanto nao

    }
}
