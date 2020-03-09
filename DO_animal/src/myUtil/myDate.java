package myUtil;

//
import java.util.Date;//java 7
import java.time.LocalDate; //java8
//import java.time.Month;
/**
 *
 * @author Yuan Tiezheng 
 */
public class myDate {
   public void mydate(){
        
   }
    //java 7
   //print current date and time
   public static void PrintCurrentDate7() {
       //initiate data object
       Date date = new Date();
        
       //  toString() show date and time
       System.out.println(date.toString());
   }
   
    //java 8
   //print current date and time
   public static void PrintCurrentDate8() {
       //initiate data object
       LocalDate today = LocalDate.now();
       //       
       System.out.println(today);
   }
   
   //
   public static int CurrentYear(){
       LocalDate today = LocalDate.now();
       int year= today.getYear();
       return year;
   }
   
   //
   public static int CurrentMonth(){
       LocalDate today = LocalDate.now();
       // return value 1-12
       int month= today.getMonthValue();
       return month;
   }
   
   //
   public static int GetStringYear(String dateStr){
       //string to localdate
       LocalDate d=LocalDate.parse(dateStr);
       System.out.println(d);
       //
       int year=d.getYear();
       return year;
    }
   
      //difference input year and current year
    public static int GetYearGap(LocalDate inDate){
       //input year
       int inYear = inDate.getYear();
       
       //current year
       LocalDate c = LocalDate.now();
       int currentYear = c.getYear();
       
       //difference: positive integer means passed date
       int gap = currentYear - inYear;
       return gap;
    }
    //overload the method GetYearGap
   public static int GetYearGap(String dateStr){
       //string to localdate
       LocalDate d=LocalDate.parse(dateStr);
       System.out.println(d);
       
       //
       int gap = GetYearGap(d);
       return gap;
    }
   
    //validate return 1 if the date is older than current date
    public static int ValidateOldDate(String DateStr){
       int gap = myDate.GetYearGap(DateStr);
       if (gap>=0){
            return 1;
       }else{
           return -1;
       }
   }
}
