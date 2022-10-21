package Exercicios.Mapa;

import java.util.Set;
import java.util.TreeMap;

public class MapaPalavra {
    TreeMap<String, Palavra> oMapa;

    public MapaPalavra() {
        oMapa = new TreeMap<String, Palavra>();
    }

    public void inserirPalavra(String palavra, Palavra significado) {
        oMapa.put(palavra, significado);
    }

    public void removerPalavra(String palavra) {
        if (oMapa.remove(palavra) != null) {
            System.out.println("Excluído com sucesso!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public void consultarPalavra(String palavra) {
        if (oMapa.get(palavra) != null) {
            oMapa.get(palavra).mostrarPalavra();
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    //Listo todos os Palavras
    public void listarPalavra() {
        // Transformo em conjunto de chaves
        Set<String> oR = oMapa.keySet();
        // Transformo o conjunto em um vetor de objetos
        Object ob[] = oR.toArray();
        // Percorro todo o vetor
        for (int i = 0; i < ob.length; i++) {
            //A cada volta no vetor transformo o objeto em i em uma String e após isso adiciono ele como uma chave
            String chave = (String) (ob[i]);
            //Em seguida pego as chaves uma a uma e mostro os Palavras
            oMapa.get(chave).mostrarPalavra();
        }
    }
}
