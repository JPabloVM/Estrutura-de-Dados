package Exercicios.Mapa;

public class Palavra {
    private String palavra;
    private String significado;

    public Palavra(String palavra, String significado) {
        this.palavra = palavra;
        this.significado = significado;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public void mostrarPalavra() {
        System.out.println("=================================\n" + "Palavra: " + getPalavra() + "\nSignificado: "
                + getSignificado() + "\n=================================");
    }
}
