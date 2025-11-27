import java.util.Scanner;

public class discount{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the marked price of an item: ");
        
        float mp = scan.nextFloat();
        
        float a = mp- (mp * 60/100);
        float b = mp - (mp * 40/100);
        float c = mp - (mp * 20/100);
        float d = mp - (mp * 10/100);
        
        System.out.println("Choose your category and check out their discounts!\n A--60%\n B--40%\n C--20%\n D--10%");
        scan.nextLine();
        char choice = scan.next().charAt(0);
        if(choice == 'a' || choice == 'A'){
            System.out.println("The Selling price is " + a);
            
        }
        else if(choice == 'b' || choice =='B'){
            System.out.println("The selling price is " + b);
        }
        else if(choice == 'c' || choice =='C'){
            System.out.println("The selling price is " + c);
        }
        else if(choice == 'd' || choice =='D'){
            System.out.println("The selling price is " + d);
        }
        
    

    
    }
    }
