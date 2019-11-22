
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        Scanner reader = new Scanner(System.in);
        BirdDatabase birds = new BirdDatabase(); // must be declare outside the loop
        
        while(true) {
            System.out.print("? ");
            String command = reader.nextLine().toLowerCase();
            
            
            if(command.equals("quit")){
                break;
            
            }
            
            if(command.equals("add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                
                Bird bird = new Bird(name, latinName);
                birds.add(name, latinName);
                
            } 
            
            if(command.equals("observation")){
                System.out.print("What was observed? ");
                String observed = reader.nextLine();
                
                birds.observation(observed);
                
            } 
            
            if(command.equals("statistics")){
                birds.statistics();
                
            } 
            
            if(command.equals("show")){
                System.out.print("What? ");
                String name = reader.nextLine();
                
                birds.show(name);
            }
            
        }
    }

}
