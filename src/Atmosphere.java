/**
 "atmosphere":
 "humidity":"66",
 "pressure":"965.0",
 "rising":"0",  PREGUNTAR A QUE SE REFIERE
 "visibility":"16.1"
 */
public class Atmosphere {
    private int humidity;
    private double presion;
    private double visibility;

    //Getter and Setter Humidity
    public void getHumidity() {
        System.out.println ( "La humedad es de: " + this.humidity + "%");
    }
    public void setHumidity(int newHumidity) {
        this.humidity = newHumidity;
    }

    // Getter and Setter Presion
    public void getPresion() {
        System.out.println ( "La presion del viento es de: " + this.presion );
    }
    public void setPresion(double newPresion ) {
        this.presion = newPresion;
    }

    //Getter and Setter Visibility
    public void getVisibility() {
        System.out.println ( "La visibilidad es de: " + this.visibility + "%");
    }

    public void setVisibility(double newVisibility) {
        this.visibility = newVisibility;
    }
}
