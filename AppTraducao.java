package Interface1;

public class AppTraducao {
    public static void main(String[] args) {
        Portugues traducao = new Portugues('P',45,"alemão");
        System.out.println(traducao);
        Traducao traducao2 = new Estrangeira('E',45,"P","A");
        System.out.println(traducao2);
    }
}
