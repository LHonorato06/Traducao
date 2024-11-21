package Interface1;

public abstract class Traducao {
    static private int ultimoId = 0;
    private int idTraducao;
    private char tipoTraducao;
    private int qtdePalavras;
    protected double valorTraducao;

    public Traducao(char tipoTraducao, int qtdePalavras){
        this.idTraducao = ++ultimoId;
        this.tipoTraducao = tipoTraducao;
        this.qtdePalavras = qtdePalavras;
    }

    public char getTipoTraducao() {
        return tipoTraducao;
    }

    public void setTipoTraducao(char tipoTraducao) {
        this.tipoTraducao = tipoTraducao;
    }

    public int getQtdePalavras() {
        return qtdePalavras;
    }

    public void setQtdePalavras(int qtdePalavras) {
        this.qtdePalavras = qtdePalavras;
    }

    public int getIdTraducao() {
        return idTraducao;
    }

    public double getValorTraducao() {
        return valorTraducao;
    }

    @Override
    public String toString() {
        return "Traducao{" +
                "idTraducao=" + idTraducao +
                ", tipoTraducao=" + (tipoTraducao=='P' ? "Português" : "Estrangeira") +
                ", qtdePalavras=" + qtdePalavras +
                ", valorTraducao=" + String.format("R$ %.2f", valorTraducao);
    }


    public abstract double calculaTraducao();
}
