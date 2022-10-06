package Filas;

public class EstruturaFila {
    public static void main(String[] args) {
        Fila oF = new Fila();
        System.out.println("A pilha está vazia? \n" + "Resposta: " + oF.isVazia());
        oF.inQueue("Carro Azul");
        oF.inQueue("Carro Verde");
        oF.inQueue("Carro Vermelho");
        oF.listar();

        System.out.println("O primeiro carro a entrar na fila foi o: "+oF.primeiro());
        System.out.println("O último carro a entrar na fila foi o: "+oF.ultimo());

        oF.deQueue();
        oF.listar();
        System.out.println("A pilha está vazia? \n" + "Resposta: " + oF.isVazia());
        
    }
}
