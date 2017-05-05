import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/*
"location":
    "city":"Cordoba";
    "country":"Argentina",
    "region":" CBA"

C:\ProgramData\MySQL\MySQL Server 5.7\Data\java_bootcamp

 */
public class Location{
    private String city;
    private String province;
    private String country;
    Connection conn = null;

    //Getters de la clase Location
    public void getCity (){
        System.out.println("Ciudad: " + this.city );
    }
    public void getProvince() {
        System.out.println("Provincia: " + this.province);
    }
    public void getCountry() {
        System.out.println("Pais: " + this.country );
    }

    //Setters de la clase Location
    public void setCity(String newCity){
        this.city = newCity;
    }
    public void setProvince(String newProvince){
        this.province = newProvince;
    }
    public void setCountry(String newCountry){
        this.country = newCountry;
    }

    public void dbConnect() {
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/java_bootcamp" +
                            "user=root&password=admin");
        }catch (SQLException e){
            System.out.println("Cannot connect - " + e);
        }
    }

    public void dbQuery(){
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT city, province, country FROM java_bootcamp.location");
            while (rs.next()){
                System.out.println("DB Ciudad: "+ rs.getString("city"));
                System.out.println("DB Provincia: "+ rs.getString("province"));
                System.out.println("DB Pais: "+ rs.getString("country"));
            }

        }
        catch (SQLException ex){
            System.out.println("Cannot read - " + ex);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { }
                stmt = null;
            }
        }
    }

    public static void main(String[] args){



        //Inicializa una variable de la clase Location
        Location newLocation = new Location();
        newLocation.dbConnect();
        newLocation.dbQuery();
        newLocation.setCity( "Cordoba (Capital)" );
        newLocation.setProvince( "Cordoba" );
        newLocation.setCountry( "Argentina");
        newLocation.getCity();
        newLocation.getProvince();
        newLocation.getCountry();


        /*
        //Inicializa una variable de la clase Atmosphere
        Atmosphere newAtmosphere = new Atmosphere();
        newAtmosphere.setHumidity( 90 );
        newAtmosphere.setPresion( 150.35 );
        newAtmosphere.setVisibility( 18.44 );
        newAtmosphere.getHumidity();
        newAtmosphere.getPresion();
        newAtmosphere.getVisibility();

        //Inicializa una variable de la clase Wind
        Wind newWind = new Wind();
        //newWind.setChill (30 );
        newWind.setDirection( 0 );
        newWind.setSpeed( 17 );
        //newWind.getChill();
        newWind.getDirection();
        newWind.getSpeed();

        //Inicializa un arreglo de la clase Weather, que contiene el pronostico de los proximos 10 dias
        String[] fecha = {"04/05/2017","05/05/2017","06/05/2017","07/05/2017","08/05/2017","09/05/2017","10/05/2017","11/05/2017","12/05/2017","13/05/2017"};
        String[] dia = {"Jueves", "Viernes","Sabado","Domingo","Lunes","Martes","Miercoles"};
        Weather[] newWeather = new Weather[10];
        for( int i=0 ; i<10 ; i++ ){
            newWeather[i].setCode( 30 );
            newWeather[i].setWDate( fecha[i] );
            newWeather[i].setWDay( dia[ i%7 ] );
            newWeather[i].setTempMin( 21-i%3 );
            newWeather[i].setTempMax( 27+i%3 );
        }*/

    }
}