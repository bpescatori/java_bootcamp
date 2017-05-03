/*
"forecast":[
                  {
                     "code":"30",
                     "date":"21 Apr 2017",
                     "day":"Fri",
                     "high":"64",
                     "low":"58",
                     "text":"Partly Cloudy"
                  }
 */
public class Weather {
    private int code;
    private String wDate;
    private String wDay;
    private int tempMax;
    private int tempMin;
    private String clouds;


    //Setters de la clase Weather
    public void setCode ( int newCode ){
        this.code = newCode;
    }
    public void setWDate ( String newDate ){
        this.wDate = newDate;
    }
    public void setWDay ( String newDay ) {
        this.wDay = newDay;
    }
    public void setTempMax ( int newMax ){
        this.tempMax = newMax;
    }
    public void setTempMin ( int newMin ){
        this.tempMin = newMin;
    }
    public void setClouds ( String newClouds ){
        this.clouds = newClouds;
    }

    //Getters de la clase Weather
    public void getCode (){
        //Aplicar SWITCH para los distintos codigos segun lo que representan
    }
    public void getWDate (){
        System.out.println ( "Fecha: " + this.wDate);
    }
    public void getWDay (){
        //Aplicar SWITCH para transformar los dias
        System.out.println ( "Dia: " + this.wDay);
    }
    public void getTempMax (){
        System.out.println ( "Maxima: " + this.tempMax + "°F");
    }
    public void getTempMin (){
        System.out.println ( "Minima: " + this.tempMin + "°F");
    }
    public void getClouds (){
        //Pasar de ingles a español
        System.out.println ( "Cielo " + this.clouds );
    }

}
