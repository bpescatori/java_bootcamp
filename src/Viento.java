/**
"wind":
    "chill":"64",
    "direction":"203",
    "speed":"7"
 */
public class Viento {
    private int fuerza;
    private int direccion;
    private int velocidad;


    //Getter and Setter fuerza
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    //Getter and Setter direccion
    public int getDireccion() {
        if ( this.direccion < 100 ) {
            System.out.println("El viento corre hacia el sur");
        }
        else if (this.direccion >= 100 && this.direccion < 200){
            System.out.println("El viento corre hacia el este");
        }
        else if (this.direccion >= 200 && this.direccion < 300){
            System.out.println("El viento corre hacia el norte");
        }
        else{
            System.out.println("El viento corre hacia el este");
        }
        return direccion;
    }
    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    //Getter and Setter velocidad
    public int getVelocidad() {
        System.out.println( "La velocidad del viento es de: " +this.velocidad );
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
