package evento.ingressos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();

        ingressos.add(new IngressoVIP(200.0, "Estádio Nacional", "10/09/2025", 1, "Frente do Palco"));
        ingressos.add(new IngressoEstudante(200.0, "Estádio Nacional", "10/09/2025", 2, "Universidade X"));
        ingressos.add(new IngressoCortesia(200.0, "Estádio Nacional", "10/09/2025", 3, "Empresa Y"));

        for (Ingresso ingresso : ingressos) {
            System.out.println(ingresso);
        }
    }
}
