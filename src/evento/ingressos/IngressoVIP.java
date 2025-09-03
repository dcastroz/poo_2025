package evento.ingressos;

public class IngressoVIP extends Ingresso {
    
	private String areaVIP;

    public IngressoVIP(double valor, String local, String data, int lote, String areaVIP) {
        super(valor, local, data, lote);
        this.areaVIP = areaVIP;
    }

    public String getAreaVIP() { return areaVIP; }
    public void setAreaVIP(String areaVIP) { this.areaVIP = areaVIP; }

    @Override
    public double calcularValorFinal() {
        return getValor() + 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Área VIP: " + areaVIP + ", Valor Final: R$ " + calcularValorFinal();
    }
}
