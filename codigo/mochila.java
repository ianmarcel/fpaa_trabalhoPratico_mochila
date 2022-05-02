import java.util.ArrayList;
import java.util.List;

public class mochila {
    public static final int CAPACIDADE_MAX = 10;
    private int pesoAtualMochila;
    private List<ItemMochila> listaDeitens;
    private int capacidadeAlteravel; // Dps troca pra private

  
    public void adicionar(ItemMochila item) {
        //if (item.getPeso() + this.pesoAtualMochila < mochila.CAPACIDADE_MAX) {
            if (item.getPeso() + this.pesoAtualMochila < this.capacidadeAlteravel) {
            this.pesoAtualMochila += item.getPeso();
            listaDeitens.add(item);
        }

    }

    public mochila() {
        this.pesoAtualMochila = 0;
        this.listaDeitens = new ArrayList<ItemMochila>();
    }

    public mochila(int capacidadeMaximaVCqueEscolher) {
        this.pesoAtualMochila = 0;
        this.listaDeitens = new ArrayList<ItemMochila>();
        this.capacidadeAlteravel = capacidadeMaximaVCqueEscolher;
    }

    public List<ItemMochila> getListaDeItens() {
        return this.listaDeitens;
    }

}
