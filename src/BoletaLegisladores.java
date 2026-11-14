public class BoletaLegisladores extends BoletaElectoral{

    public BoletaLegisladores(String nombreCandidato, String partidoPolitico) {
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {

        if (cantidadEmitida >= 0 && cantidadEmitida <= 5) {
            return cantidadEmitida;
        }

        return 0;
    }
}
