import java.util.Scanner;

public class divisible{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        
        int num = scan.nextInt();
        
        if(num%5 == 0 && num%3 ==0){
            System.out.println("Yes the number " + num + " is divisible by 3 and 5");
        }
        else{
            System.out.println("NO it is not divisible by 3 and 5");
        }
        
        
        
    }
}