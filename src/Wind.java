/**
 "wind":
 "chill":"64",
 "direction":"203",
 "speed":"7"
 */
public class Wind {
    //private int chill;
    private int direction;
    private int speed;


    /***** Preguntar si alguien sabe a que se refiere el campo chill *****
    public void getChill() {
    }
    public void setChill(int newChill) {
        this.chill = newChill;
    }*/


    //Getter and Setter direccion
    public void getDirection() {
        if ( this.direction < 100 ) {
            System.out.println("El viento corre hacia el norte");
        }
        else if (this.direction >= 100 && this.direction < 200){
            System.out.println("El viento corre hacia el este");
        }
        else if (this.direction >= 200 && this.direction < 300){
            System.out.println("El viento corre hacia el sur");
        }
        else{
            System.out.println("El viento corre hacia el oeste");
        }
    }
    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }


    //Getter and Setter velocidad
    public void getSpeed() {
        System.out.println( "La velocidad del viento es de: " +this.speed + " mph" );
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
}