/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timezoneconverter;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;


public class TimeZoneConverter {

    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
    
    public static void main(String[] args){
                
              //current , opcii ot zoni , i si posochvam
              SimpleDateFormat formatTimeZone = new SimpleDateFormat(DATE_FORMAT);
              Calendar calendar = new GregorianCalendar();
              Scanner inputTimeZone = new Scanner(System.in);
              
              String[] getAllTimeZones = TimeZone.getAvailableIDs();
              Arrays.sort(getAllTimeZones);
              
              for (String allTimeZone : getAllTimeZones) {
                  System.out.println(allTimeZone);
              }
              System.out.println("####################################");
              System.out.println("####################################");
              
              ZonedDateTime currentTimeZone = ZonedDateTime.now();
              System.out.println("CurrentTimeZone: "+currentTimeZone.getZone());
              System.out.println("Enter timezone: ");
              String timeZone = inputTimeZone.nextLine().trim();
              
              for (String allTimeZone : getAllTimeZones) {
              
                if (timeZone.equals(allTimeZone)) 
                {
                    System.out.println("Current# => "+DateTimeFormatter.ofPattern(DATE_FORMAT).format(currentTimeZone));
                    TimeZone expectTmz = TimeZone.getTimeZone(allTimeZone);
                    formatTimeZone.setTimeZone(expectTmz);
                    System.out.println("Expected# => "+expectTmz.getDisplayName()+"\nTime: "+formatTimeZone.format(calendar.getTime()));
                } 
        }
    }
}