import java.util.Scanner;

public class grade{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter your gpa");
        
        double gpa = scan.nextFloat();
        
        if(gpa > 4.0){
            System.out.println("Invalid");
            
        }
        
        else if(gpa < 4.0 && gpa > 3.0){
            System.out.println("Your grade is A");
        }
        else if(gpa < 3.0 && gpa > 2.0){
            System.out.println("Your grade is B");
        }
        else if (gpa < 2.0){
            System.out.println("You are fail");
        }
    }
}