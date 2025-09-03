package evento.ingressos;

public abstract class Ingresso {
	
	private double valor;
    private String local;
    private String data;
    private int lote;

    public Ingresso(double valor, String local, String data, int lote) {
        this.valor = valor;
        this.local = local;
        this.data = data;
        this.lote = lote;
    
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public int getLote() { return lote; }
    public void setLote(int lote) { this.lote = lote; }

    public abstract double calcularValorFinal();

    @Override
    public String toString() {
        return "Local: " + local + ", Data: " + data + ", Lote: " + lote + ", Valor Base: R$ " + valor;
    }
}
