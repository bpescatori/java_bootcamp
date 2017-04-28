/*
"location":
    "city":"Cordoba";
    "country":"Argentina",
    "region":" CBA"
 */
public class Ubicacion {
    private String provincia;
    private String pais;

    public Ubicacion (String ciudad){
        System.out.println("Ciudad: " + ciudad );
    }

    public String getProvincia() {
        System.out.println("Provincia: " + provincia );
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        System.out.println("Pais: " + pais );
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static void main(String[] args){
        //Inicializa una variable de la clase Ubicacion
        Ubicacion ciudad = new Ubicacion("Cordoba");
        ciudad.setProvincia( "Cordoba" );
        ciudad.setPais( "Argentina");
        ciudad.getProvincia();
        ciudad.getPais();

        //Inicializa una variable de la clase Atmosfera
        Atmosfera atmosfera = new Atmosfera();
        atmosfera.setHumedad( 90 );
        atmosfera.setPresion( 150.35 );
        atmosfera.setVisibilidad( 18.44 );
        atmosfera.getHumedad();
        atmosfera.getPresion();
        atmosfera.getVisibilidad();
    }
}
