import java.util.LinkedList;


public class ListaEncadeada {
    public static void main(String[] args) throws Exception {
        LinkedList<String> nome = new LinkedList<>();
        // Foi adicionado na primeira posição da lista
        nome.addFirst("Gastão");
        // Foi adicionado na primeira posição da lista e enviou o Gastão para a segunda
        // posição
        nome.addFirst("Donald");
        // Foi adicionado na primeira posição da lista e enviou o Tio Patinhas para a
        // segunda posição
        nome.addFirst("Tio Patinhas");
        // Foi adicionado na última posição da lista
        nome.addLast("Gansolino");
        // Foi adicionado na última posição da lista e enviou o Gansolino para a
        // penúltima posição
        nome.addLast("Gansolino");

        // Removeu quem estava na primeira posição da lista, no caso o Tio Patinhas
        nome.removeFirst();
        // Removeu quem estava na última posição da lista, no caso o Gansolino
        nome.removeLast();
        // Foi adicionado na primeira posição da lista
        nome.addFirst("Prof. Pardal");
        // Foi adicionado na primeira posição da lista
        nome.addFirst("Huguinho");
        // Imprime a lista
        System.out.println(nome);
        // Imprime o tamanho da lista
        System.out.println(nome.size());
        // Informa se a lista está vazia, se estiver retorna true, senão retorna false
        System.out.println(nome.isEmpty());
        // Limpo a lista
        /* 
          nome.clear();
          System.out.println(nome.size());
         */
        // Percorro a lista
        for (int i = 0; i < nome.size(); i++) {
            System.out.println("Família Pato: " + nome.get(i));
        }
        // Imprimo o primeiro da lista
        System.out.println(nome.getFirst());
        // Imprimo o último da lista
        System.out.println(nome.getLast());
        // Transforma minha lista em um Array
        Object v[] = nome.toArray();
        // Percorro o Array
        for (int i = 0; i < v.length; i++) {
            // Imprimo o Array
            System.out.println(v[i]);
        }
    }
}
