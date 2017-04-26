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
}
