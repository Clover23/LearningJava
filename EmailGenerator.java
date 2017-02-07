import java.util.Scanner;
/**
 * This program takes user's name and surname as input and creates e-mail adress
 * which length should be exactly 8 characters
 */

public class EmailGenerator {
  
  static String domain;
  
  static String makeUserName (String name, String surname){
    if ((surname.length() + name.length())<8){
      String uName = name + surname;
      do {uName = uName + "x";
          uName.length();
      }
      while (uName.length() <8);
      uName = uName.toLowerCase();
      return uName;
      } 
    else if ((surname.length() + name.length()>=8 && surname.length() < 7)){
    String first = name.substring(0, ((8 - surname.length())));
    String uName = first + surname;
    uName = uName.toLowerCase();
    return uName;
      }
    else if ((surname.length() + name.length()>8 && surname.length() > 7)){
    String first = name.substring(0, 1);
    String second = surname.substring(0, 7);
    String uName1 =(first + second);
    String uName = uName1.toLowerCase();
    return uName;
    }
    else{
    String first = name.substring(0, 1);
    String uName1 =(first + surname);
    String uName = uName1.toLowerCase();
    return uName;
    }
 
  }
  
  static String makeEmail (String uName, String domain){
    domain = "gmail.com";
    String email = uName+"@"+domain;
    return email;
  }

  public static void main(String[] args){
   
     System.out.println("Please provide your name.");
     Scanner s = new Scanner(System.in);
     String name = s.nextLine();
     System.out.println("Please provide your surname.");
     String surname = s.nextLine();
     
    String uName = EmailGenerator.makeUserName(name, surname);
    
    String result = EmailGenerator.makeEmail(uName, domain);
    
    System.out.println("This user's e-mail is: " + result);
  
  }

}
