
package prime;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=in.nextInt();
        int i=1;
        while(i<=num){
            if(num%i==0){
                count++;
                i++;
                
            }
        }
            if(count==2){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is  not prime number");
            }
        }
    }

        