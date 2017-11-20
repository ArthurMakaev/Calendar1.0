package com.vk.amakaev;



import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ////////////////////////////
        GregorianCalendar d=new GregorianCalendar();


        int today=d.get(Calendar.DAY_OF_MONTH);
        int mounth=d.get(Calendar.MONTH);


        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday=d.get(Calendar.DAY_OF_WEEK);


        int firstDayofWeek=d.getFirstDayOfWeek();

        int indent=0;
        while (weekday!=firstDayofWeek){
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }
        String[] weekDayNames=new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.printf("%4s",weekDayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }while (weekday!=firstDayofWeek);
        System.out.println();
        for(int i=1;i<=indent;i++)
            System.out.print("    ");
       d.set(Calendar.DAY_OF_MONTH,1);
       do{
           int day=d.get(Calendar.DAY_OF_MONTH);
           System.out.printf("%3d",day);
           if(day==today){
               System.out.printf("*");
           }
           else {
               System.out.printf(" ");
           }
           d.add(Calendar.DAY_OF_MONTH,1);
           weekday=d.get(Calendar.DAY_OF_WEEK);
           if(weekday==firstDayofWeek){
               System.out.println();
           }
       }while (d.get(Calendar.MONTH)==mounth);
           if(weekday!=firstDayofWeek){
               System.out.println();
           }

    }
}
