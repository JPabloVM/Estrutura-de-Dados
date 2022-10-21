package Mapa;

public class Estado {
    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarEstado() {
        System.out.println("=================================\n" + "Sigla: " + getSigla() + "\nEstado: " + getNome() + "\n=================================");
    }
}
