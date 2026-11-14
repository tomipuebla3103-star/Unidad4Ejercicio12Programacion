public class BoletaIntendente extends BoletaElectoral{
    public BoletaIntendente(String nombreCandidato, String partidoPolitico) {
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {

        if (cantidadEmitida >= 0) {
            return cantidadEmitida;
        }

        return 0;
    }
}
