package Interface1;

public class Portugues extends Traducao{
    private String outraLingua;
    public Portugues(char tipoTraducao, int qtdePalavras,String outraLingua) {
        super(tipoTraducao, qtdePalavras);
        this.outraLingua = outraLingua;
        this.valorTraducao = calculaTraducao();
    }
    @Override
    public double calculaTraducao(){
        return this.outraLingua.equalsIgnoreCase("inglês")
                ? this.getQtdePalavras() * 0.5 * 90
                : this.getQtdePalavras() * 0.5;

    }

    public String getOutraLingua() {
        return outraLingua;
    }

    @Override
    public String toString() {
        return super.toString() + "Portugues{" +
                "outraLingua='" + outraLingua + '\'' +
                '}';
    }
}
