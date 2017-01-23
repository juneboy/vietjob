package fi.vietjob.feature;

public class CapitalFirstLetter {
     public final static String getCapitalize(String text){
    	      return text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase();
     }
}
