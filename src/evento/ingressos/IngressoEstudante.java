package evento.ingressos;

public class IngressoEstudante extends Ingresso {
    
	private String instituicaoEnsino;

    public IngressoEstudante(double valor, String local, String data, int lote, String instituicaoEnsino) {
        super(valor, local, data, lote);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() { return instituicaoEnsino; }
    public void setInstituicaoEnsino(String instituicaoEnsino) { this.instituicaoEnsino = instituicaoEnsino; }

    @Override
    public double calcularValorFinal() {
        return getValor() / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Instituição: " + instituicaoEnsino + ", Valor Final: R$ " + calcularValorFinal();
    }
}