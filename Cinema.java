import java.util.Scanner;

public class Cinema{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---WELCOME TO XFX CINEMAS!!!---\n---Our Ticket System---\nChild: Rs.150\nAdult: Rs.250\nSenior: Rs.200");
        System.out.println();
        
        System.out.println("--Current Movies playing:--\n-ShawShank Redemption\n-Salaar\n-Star Wars\n-ChakkaPanja");
        
        System.out.println("What is your age group (child/senior/adult)?");
        String age = scan.nextLine().toLowerCase();
        
        System.out.println("What is the langauge of the movie you want to watch?(hindi/english)");
        String lang = scan.nextLine().toLowerCase();
        
        System.out.println("Are you a student? y/n");
        String student = scan.nextLine().toLowerCase();
        
        System.out.println("Is today a festival day? y/n");
        String fest = scan.nextLine().toLowerCase();
        
        int baseprice = 0;
        
        
        
        switch (age) {
            case "child":
                baseprice = 150;
                break;
            case "adult":
                baseprice = 250;
                break;
            case "senior":
                baseprice = 200;
                break;
            default:
                System.out.println("INVALID");
                return;
                
                
            
        }
        
        switch (lang){
            case "hindi":
                baseprice += 50;
                break;
            case "english":
                baseprice += 100;
            default:
                System.out.println("INVALID");
                return;
            

        }
        
        int finalprice = baseprice;
        
        if(student.equals("y")){
            finalprice = finalprice -(finalprice * 20/100);
            
        }
        
        if(fest.equals("y")) {
            finalprice = finalprice - (finalprice * 15/100);
        }
        
        System.out.println("Your total price is " + finalprice);
        


        
        
        
        
        
    
        
        
    }
}