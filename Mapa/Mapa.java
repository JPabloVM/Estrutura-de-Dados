package Mapa;
public class Mapa {
    public static void main(String[] args){
        Estado oUF = new Estado("SP", "São Paulo");
        Estado oUF2 = new Estado("AM", "Amazonas");
        Estado oUF3 = new Estado("ES", "Espiríto Santo");
        Estado oUF4 = new Estado("PE", "Pernambuco");
        Estado oUF5 = new Estado("AC", "Acre");
        oUF.mostrarEstado();

        MapaEstado oME = new MapaEstado();

        oME.inserirEstado(oUF.getSigla(), oUF);
        oME.inserirEstado(oUF2.getSigla(), oUF2);
        oME.inserirEstado(oUF3.getSigla(), oUF3);
        oME.inserirEstado(oUF4.getSigla(), oUF4);
        oME.inserirEstado(oUF5.getSigla(), oUF5);
        //oME.removerEstado(oUF.getSigla());
        //oME.consultarEstado("SP");

        oME.listarEstado();
        
    }
}
