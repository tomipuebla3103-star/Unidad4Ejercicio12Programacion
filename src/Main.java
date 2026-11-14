//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    BoletaIntendente intendente = new BoletaIntendente("Juan Perez", "Partido A");

    BoletaConcejales concejales = new BoletaConcejales("Maria Gomez", "Partido B");

    BoletaLegisladores legisladores = new BoletaLegisladores("Carlos Lopez", "Partido C");

    CentroComputos centro = new CentroComputos();

    centro.agregarBoleta(intendente);
    centro.agregarBoleta(concejales);
    centro.agregarBoleta(legisladores);

    System.out.println("REPORTE ELECTORAL");
    System.out.println("----------------------");

    centro.procesarVotos();
}
