import java.util.Scanner;

public class scholarship{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the scholarship checker");
        
        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble();
        
        System.out.println("Enter your attendace %");
        double attend = scan.nextDouble();
        
        System.out.println("Enter your attitude score (1/10):");
        int attitude = scan.nextInt();
        
        if(gpa > 3.2 && attend > 80 && attitude > 5){
            System.out.println("CONGRATULATIONS you are eligible for a scholarship!!!");
            
        }
        else{
            System.out.println("Sorry better luck next time");
        }
        
    }
    
}