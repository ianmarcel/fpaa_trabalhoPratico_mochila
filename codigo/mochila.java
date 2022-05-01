import java.util.ArrayList;
import java.util.List;

public class mochila {
    public static final int CAPACIDADE_MAX = 10;
    private int pesoAtualMochila;
    List<ItemMochila> listaDeitens;
    public int capacidadeAlteravel; // Dps troca pra private

    // IDEIAS :
    // talvez o metodo forca bruta tenha permutacao(talvez nao)
    // ideia:ia chamando o adicionar dentro do for(adicionar varios itens ate
    // estourar)
    public void adicionar(ItemMochila item) {
        if (item.getPeso() + this.pesoAtualMochila < mochila.CAPACIDADE_MAX) {
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
