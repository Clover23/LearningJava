/**This program takes a year as input and defines weathe it is leap or not */

import java.util.Scanner;
public class LeapYear {

  public static boolean isLeapYear (int year){
    if (year%400 == 0){
    return true;
      }
    else if ((year%4 ==0) && !(year%100 == 0)){
      return true;
    }
    else {
    return false;
    }
    }
  public static void main (String[] args){
  System.out.println("Please provide year");
     Scanner s = new Scanner(System.in);
     int year = s.nextInt();
     
    boolean c = LeapYear.isLeapYear(year);
    if (c){
    System.out.println("The year " + year + " is a leap year" );
    }
    else {
    System.out.println("The year " + year + " is not a leap year" );
  }
}
}