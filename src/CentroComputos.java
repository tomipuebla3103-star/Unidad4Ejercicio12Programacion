import java.util.ArrayList;
public class CentroComputos {
    private ArrayList<BoletaElectoral> boletas;

    public CentroComputos() {
        boletas = new ArrayList<>();
    }

    public void agregarBoleta(BoletaElectoral boleta) {
        boletas.add(boleta);
    }

    public void procesarVotos() {

        int totalVotos = 0;

        for (BoletaElectoral boleta : boletas) {

            int votos = boleta.contarVoto(8);

            totalVotos = totalVotos + votos;

            System.out.println("Candidato: " + boleta.nombreCandidato);
            System.out.println("Partido: " + boleta.partidoPolitico);
            System.out.println("Votos validos: " + votos);

            System.out.println("----------------------");
        }

        System.out.println("TOTAL DE VOTOS VALIDOS: " + totalVotos);
    }
}
