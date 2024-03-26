/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.*;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println(" _     ___ _   _  ___  _   _  ____    ____  _____ _____   ____   _    ____     _    ____ ___ ____  _____"); 
        System.out.println("| |   |_ _| | | |/ _ \\| | | |/ ___|  |  _ \\| ____|_   _| |  _ \\ / \\  |  _ \\   / \\  |  _ |_ _/ ___|| ____|");
        System.out.println("| |    | || |_| | | | | | | |\\___ \\  | |_) |  _|   | |   | |_) / _ \\ | |_) | / _ \\ | | | | |\\___ \\|  _|  ");
        System.out.println("| |___ | ||  _  | |_| | |_| _ ___) | |  __/| |___  | |   |  __/ ___ \\|  _ < / ___ \\| |_| | | ___) | |___ ");
        System.out.println("|_____|___|_| |_|\\___/ \\___( |____/  |_|   |_____| |_|   |_| /_/   \\_|_| \\_/_/   \\_|____|___|____/|_____|");
        System.out.println("                           |/                                                                            ");
        
        System.out.println("");
        System.out.println("_________________________________________________________________________________________________________________");
        System.out.println("");        
        
        System.out.println("1. Start");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.println("");
        System.out.print("Enter what you want to do: ");
        String action = kb.nextLine();
        if ("1".equalsIgnoreCase(action) || "start".equalsIgnoreCase(action)) {
            System.out.println("");
            System.out.println("_________________________________________________________________________________________________________________");
            System.out.println("");        
        
            System.out.println("1. ");
            System.out.println(" / \\__");
            System.out.println("(    @\\___");
            System.out.println(" /         O");
            System.out.println("/   (_____/");
            System.out.println("/_____/   U)");

            System.out.println("");  
            System.out.println("");  
        
            System.out.println("2. ");
            System.out.println("  ,   ,_");
            System.out.println("    (\\./)");
            System.out.println("   >(^,^)<");
            System.out.println("    (   )");
            System.out.println("   (\")(\")");
        
            System.out.println("");  
            System.out.println("");  
        
            System.out.println("Which pet do you want to choose? (1 or 2)");
            System.out.print("Choice: ");
            String pet = kb.nextLine();
            if (pet == "1") {
                System.out.println("You chose the DOG!!");
            }
            else {
                System.out.println("You chose the rabbit!!"); 
            }
        }
        
    }
    
}
