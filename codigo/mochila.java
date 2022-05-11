import java.util.ArrayList;
import java.util.List;

public class mochila {
    public static final int CAPACIDADE_MAX = 10;
    private int pesoAtualMochila;
    private int valorAtualMochila;
    private List<ItemMochila> listaDeitens;
    private int capacidadeAlteravel; // Dps troca pra private

  
    public void adicionar(ItemMochila item) {
        //if (item.getPeso() + this.pesoAtualMochila < mochila.CAPACIDADE_MAX) {
            if (item.getPeso() + this.pesoAtualMochila <= this.capacidadeAlteravel) {
                // é <= sim pq se for menor quando ele somar a capacidade Restante(ex:4) com o proximo item
                 //(ex: tem peso 6) Ele iria fazer 10<10 falso(e ta errado pq dava sim pra esse item) 

                 //Isso foi a ultima coisa que troquei se der erro(duvido) volta pro <
            this.pesoAtualMochila += item.getPeso();
            this.valorAtualMochila += item.getValor();
            listaDeitens.add(item);
        }

    }

    public mochila() {
        this.pesoAtualMochila = 0;
        this.listaDeitens = new ArrayList<ItemMochila>();
    }

    public mochila(int capacidadeMaximaVCqueEscolher) {
        this.pesoAtualMochila = 0;
        this.valorAtualMochila=0;
        this.listaDeitens = new ArrayList<ItemMochila>();
        this.capacidadeAlteravel = capacidadeMaximaVCqueEscolher;
    }

    public List<ItemMochila> getListaDeItens() {
        return this.listaDeitens;
    }

    public int getPesoAtual(){
        return this.pesoAtualMochila;
    }
    public int getValorAtual(){
        return this.valorAtualMochila;
    }

}
