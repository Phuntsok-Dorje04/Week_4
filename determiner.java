import java.util.Scanner;

public class determiner{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Positive Nigative or zero");
        
        System.out.println("Enter a number");
        
        double num = scan.nextDouble();
        
        if(num > 0){
            System.out.println("it is positive");
        }
        else if(num < 0){
            System.out.println("it is negative");
        }
        else if (num == 0){
            System.out.println("The number is zero");
        }
        
        
    }
}