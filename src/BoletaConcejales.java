public class BoletaConcejales extends BoletaElectoral{
    public BoletaConcejales(String nombreCandidato, String partidoPolitico) {
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {

        if (cantidadEmitida >= 0 && cantidadEmitida <= 10) {
            return cantidadEmitida;
        }

        return 0;
    }
}
