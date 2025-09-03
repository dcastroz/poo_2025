package evento.ingressos;

public class IngressoCortesia extends Ingresso {
    private String patrocinador;

    public IngressoCortesia(double valor, String local, String data, int lote, String patrocinador) {
        super(valor, local, data, lote);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() { return patrocinador; }
    public void setPatrocinador(String patrocinador) { this.patrocinador = patrocinador; }

    @Override
    public double calcularValorFinal() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Patrocinador: " + patrocinador + ", Valor Final: R$ " + calcularValorFinal();
    }
}