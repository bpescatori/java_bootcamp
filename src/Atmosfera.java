/**
"atmosphere":
    "humidity":"66",
    "pressure":"965.0",
    "rising":"0",
    "visibility":"16.1"
 */
public class Atmosfera {
    private int humedad;
    private double presion;
    private double visibilidad;

    //Getter and Setter Humedad
    public int getHumedad() {
        System.out.println ( "La humedad es de: " + this.humedad + "%");
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    // Getter and Setter Presion
    public double getPresion() {
        System.out.println ( "La presion del viento es de: " + this.presion );
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    //Getter and Setter Visibilidad
    public double getVisibilidad() {
        System.out.println ( "La visibilidad es de: " + this.visibilidad + "%");
        return visibilidad;
    }

    public void setVisibilidad(double visibilidad) {
        this.visibilidad = visibilidad;
    }
}
