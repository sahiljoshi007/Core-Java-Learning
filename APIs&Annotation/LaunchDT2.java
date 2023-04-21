import java.time.*;                                   //joda Date and Time API

public class LaunchDT2 {
    public static void main(String[] args) {                  
        
      LocalDate date=LocalDate.now();
        System.out.println(date);  

        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();

        System.out.println(day + "/" + month + "/" + year);




        LocalTime time=LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int minute=time.getMinute();
        int seconds=time.getSecond();
        int nanoSec=time.getNano();

        System.out.println(hour+":"+minute+":"+seconds+":"+nanoSec);

    }
}
