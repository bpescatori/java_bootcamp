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

import java.util.Date;

public class Pronostico {
    private int[] code = new int[10];
    private Date[] fecha = new Date[10];
    private String[] dia = new String[10];
    private int[] maxima = new int[10];
    private int[] minima = new int[10];
    private String[] nubosidad = new String[10];

    public int[] getCode() {
        return code;
    }

    public Date[] getFecha() {
        return fecha;
    }

    public String[] getDia() {
        return dia;
    }

    public int[] getMaxima() {
        return maxima;
    }

    public int[] getMinima() {
        return minima;
    }

    public String[] getNubosidad() {
        return nubosidad;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    public void setFecha(Date[] fecha) {
        this.fecha = fecha;
    }

    public void setDia(String[] dia) {
        this.dia = dia;
    }

    public void setMaxima(int[] maxima) {
        this.maxima = maxima;
    }

    public void setMinima(int[] minima) {
        this.minima = minima;
    }

    public void setNubosidad(String[] nubosidad) {
        this.nubosidad = nubosidad;
    }
}
