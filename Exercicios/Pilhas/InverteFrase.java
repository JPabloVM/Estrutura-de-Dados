package Exercicios.Pilhas;

public class InverteFrase {
    public static void main(String[] args) {
        ExPilha pilha = new ExPilha();

        
        String frase = "ESTE EXERCICIO E MUITO FACIL";

        for (int i =0; i<frase.length(); i++) {
            pilha.push(frase.charAt(i));
            
        }
               
        
    }
}
