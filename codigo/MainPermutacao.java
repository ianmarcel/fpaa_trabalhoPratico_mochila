public class MainPermutacao {
    // As classes item ,mochila e utils nao vao mudar(vao ser reaproveitadas aqui)
    // o unico metodo q vai mudar de utils é o o bolha
    // primeiro gerar os itens(so usar o gerador de itens)*dica tenta usar os mesmos  numeros do mainGuloso
    // com uma matriz vou armazenar todas as possibilidades( 12 123 23...)
    // com um contador somar os pesos dessas combinacoes
    // Se for menor q 15 Chamar o bolha(so alterar ele pra dados.ContadorDePeso/algo
    // assim talvez seja dificil)
    public static void main(String args[]) {
        int capacidadeAEscolher = 10;
        int quantItems = 4;
        mochila m = new mochila(capacidadeAEscolher); 
        ItemMochila[] ListaDeitens = new ItemMochila[quantItems];
       // int[] itensMatriz_Combinacoes = new int[quantItems]; //pq so o peso q me interessa
        //talvez vai ser do tipo ItemMochilaMesmo por causa do valor do item
       // int somadorDePesos=0;//vai somar os getPesos de cada combinacao de itens


        // instanciar cada item
        for (int i = 0; i < ListaDeitens.length; i++) {
            ListaDeitens[i] = new ItemMochila();
        }

        ListaDeitens = UtilLs.geraVetor(quantItems, false, capacidadeAEscolher);
        //ex: nesse caso criei 4 itens cada um com seu peso E armazenei esses itens no Vetor itens(da linha 13)
        //tenho que combinar esses itens(o item 1.getPeso com o 2 , o 1 com o 3)


    }
}
