import java.util.Scanner;

public class odd_or_even{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("---Odd or even---");
        
        System.out.println("Enter your number: ");
        
        int num = scan.nextInt();
        
        if(num % 2 == 0){
            System.out.println("The number "  + num + " is even.");
        }
        else{
            System.out.println("The number " + num + " is odd.");
        }
        
        
    }
}