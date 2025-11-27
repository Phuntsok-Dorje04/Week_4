import java.util.Scanner;

public class pass_or_fail{
public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("The passing marks is 40---");
    
    System.out.println("Enter your marks: ");
    
    double marks = scan.nextDouble();
    
    if(marks >= 40){
        System.out.println("Your marks is " + marks + ", you have passed the exam");
    {
        
    }
    
    }
    else{
        System.out.println("Sorry you have failed you imbecile noob.");
    }
    
}
}