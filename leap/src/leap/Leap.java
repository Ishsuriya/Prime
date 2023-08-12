
package leap;
import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Century year and not a leap year");
                }
            }
            
            
        }
        else{
            System.out.println("Leap year");
        }
       
    }
    
}
