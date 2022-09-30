public class EstruturaPilha {

    public static void main(String[] args) {
        Pilha oT = new Pilha();
        System.out.println(oT.isVazia());
        oT.push(1);
        oT.push(2);
        oT.push(3);
        oT.listar();

        System.out.println(oT.primeiro());
        System.out.println(oT.ultimo());

    }

}
