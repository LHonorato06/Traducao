package Interface1;

public class Estrangeira extends Traducao{
    private String linguaOrigem;
    private String linguaDestino;
    public Estrangeira(char tipoTraducao, int qtdePalavras,String linguaDestino, String linguaOrigem ){
        super(tipoTraducao, qtdePalavras);
        this.linguaDestino = linguaDestino;
        this.linguaOrigem = linguaOrigem;
        this.valorTraducao = calculaTraducao();
    }
    @Override
    public double calculaTraducao(){
        valorTraducao = getQtdePalavras() * 0.8;
        return valorTraducao;
    }

    public String getLinguaOrigem() {
        return linguaOrigem;
    }

    public String getLinguaDestino() {
        return linguaDestino;
    }

    @Override
    public String toString() {
        return "Estrangeira{" +
                "linguaOrigem='" + linguaOrigem + '\'' +
                ", linguaDestino='" + linguaDestino + '\'' +
                ", valorTraducao=" + valorTraducao +
                '}';
    }
}
