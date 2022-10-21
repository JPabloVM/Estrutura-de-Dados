package Mapa;

import java.util.Set;
import java.util.TreeMap;

public class MapaEstado {
    TreeMap<String, Estado> oMapa;

    public MapaEstado() {
        oMapa = new TreeMap<String, Estado>();
    }

    public void inserirEstado(String sigla, Estado uf) {
        oMapa.put(sigla, uf);
    }

    public void removerEstado(String sigla) {
        if (oMapa.remove(sigla) != null) {
            System.out.println("Excluído com sucesso!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public void consultarEstado(String sigla) {
        if (oMapa.get(sigla) != null) {
            oMapa.get(sigla).mostrarEstado();
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    //Listo todos os estados
    public void listarEstado() {
        // Transformo em conjunto de chaves
        Set<String> oR = oMapa.keySet();
        // Transformo o conjunto em um vetor de objetos
        Object ob[] = oR.toArray();
        // Percorro todo o vetor
        for (int i = 0; i < ob.length; i++) {
            //A cada volta no vetor transformo o objeto em i em uma String e após isso adiciono ele como uma chave
            String chave = (String) (ob[i]);
            //Em seguida pego as chaves uma a uma e mostro os Estados
            oMapa.get(chave).mostrarEstado();
        }
    }
}
