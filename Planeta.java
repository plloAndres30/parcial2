public class Planeta {
    private String nombre;
    private int cantidadDeSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean observable;

    public Planeta(String nombre, int cantidadDeSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean observable) {
        this.nombre = nombre;
        this.cantidadDeSatelites = cantidadDeSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.observable = observable;
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadDeSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (m^3): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia al Sol (km): " + distanciaAlSol);
        System.out.println("Es observable desde la Tierra: " + (observable ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        // Crear objetos de tipo Planeta
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta jupiter = new Planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        // Mostrar información y densidad de los planetas
        tierra.mostrarInformacion();
        System.out.println("Densidad de la Tierra (kg/m^3): " + tierra.calcularDensidad());
        System.out.println();
        jupiter.mostrarInformacion();
        System.out.println("Densidad de Júpiter (kg/m^3): " + jupiter.calcularDensidad());
    }
}
