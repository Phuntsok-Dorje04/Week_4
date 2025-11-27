import java.util.Scanner;

public class nested_if{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        
        int num = scan.nextInt();
        
        if(num%3 == 0 && num%5 !=0){
            System.out.println("The number is divisible by 3 but not by 5");
            if(num%5 == 0 && num%3 !=0){
                System.out.println("The number is divisible by 5 and not by 3");
                
            }
        }
        else if(num%3 == 0 && num%5 == 0){
            System.out.println("The number is divisible by both 3 and 5");
            
            
        }
        else{
            System.out.println("The number is not divisible by 3 and 5");
        }
        
        
    }
}