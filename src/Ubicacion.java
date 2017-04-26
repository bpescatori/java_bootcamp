/*
"location":{
               "city":"Cordoba",
               "country":"Argentina",
               "region":" CBA"
 */
public class Ubicacion {
    String provincia;
    String pais;

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
        Ubicacion ciudad = new Ubicacion("Cordoba");
        ciudad.setProvincia( "Cordoba" );
        ciudad.setPais( "Argentina");
        ciudad.getProvincia();
        ciudad.getPais();
    }
}
