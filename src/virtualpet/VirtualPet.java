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
        Random rdm = new Random();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";
        String name = "";
        int letter1;
        int letter2;
        int letter3;
        int letter4;
        int maxHealth;
        int maxFood;
        int maxEnergy;
        boolean correct = false;
        boolean choosePet = true;
        int rdmNum;
        boolean accurate = false;
        
        // Starting screen 
        System.out.println(" _     ___ _   _  ___  _   _  ____    ____  _____ _____   ____   _    ____     _    ____ ___ ____  _____"); 
        System.out.println("| |   |_ _| | | |/ _ \\| | | |/ ___|  |  _ \\| ____|_   _| |  _ \\ / \\  |  _ \\   / \\  |  _ |_ _/ ___|| ____|");
        System.out.println("| |    | || |_| | | | | | | |\\___ \\  | |_) |  _|   | |   | |_) / _ \\ | |_) | / _ \\ | | | | |\\___ \\|  _|  ");
        System.out.println("| |___ | ||  _  | |_| | |_| _ ___) | |  __/| |___  | |   |  __/ ___ \\|  _ < / ___ \\| |_| | | ___) | |___ ");
        System.out.println("|_____|___|_| |_|\\___/ \\___( |____/  |_|   |_____| |_|   |_| /_/   \\_|_| \\_/_/   \\_|____|___|____/|_____|");
        System.out.println("                           |/                                                                            ");
        
        System.out.println("");
        System.out.println("_________________________________________________________________________________________________________________");
        System.out.println("");        
        
        // Enter username and password
        for (int tries = 2; tries > -1 && !(correct); tries--) {
            System.out.print("Username: ");
            String username = kb.nextLine();
            System.out.print("Password: ");
            String password = kb.nextLine();
        
        while ("snoopy".equalsIgnoreCase(username) || "toto".equalsIgnoreCase(password)) {
            
            correct = true;
            
            // User's action
            if (choosePet) {
                System.out.println("1. Start");
            }
            else {
                System.out.println("1. Play/Interact");
            }
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.print("Enter what you want to do: ");
            String action = kb.nextLine();
            
            if ("1".equalsIgnoreCase(action) || "start".equalsIgnoreCase(action)) {
                
                choosePet = false;
                
                System.out.println("");
                System.out.println("_________________________________________________________________________________________________________________");
                System.out.println("");        
                
                // Pet 1 
                System.out.println("1. ");
                System.out.println(" / \\__");
                System.out.println("(    @\\___");
                System.out.println(" /         O");
                System.out.println("/   (_____/");
                System.out.println("/_____/   U)");

                System.out.println("");  
                System.out.println("");  
        
                // Pet 2
                System.out.println("2. ");
                System.out.println("  ,   ,_");
                System.out.println("    (\\./)");
                System.out.println("   >(^,^)<");
                System.out.println("    (   )");
                System.out.println("   (\")(\")");
        
                System.out.println("");  
                System.out.println("");  
        
                // Choose Pet
                System.out.println("Which pet do you want to choose? (1 or 2)");
                System.out.print("Choice: ");
                String pet = kb.nextLine();
                if (pet == "1") {
                    System.out.println("You chose the dog!!");
                }
                else {
                    System.out.println("You chose the rabbit!!"); 
                }
                
                System.out.println("");
                System.out.println("_________________________________________________________________________________________________________________");
                System.out.println("");
                
                // Name pet
                System.out.println("Make a name for your pet!!");
                System.out.println("1. Choose a name myself!");
                System.out.println("2. Choose a name for me!");
                System.out.print("My decision (1 or 2): ");
                int nameDecision = kb.nextInt();
                
                // Name by user
                if (nameDecision == 1) {
                    System.out.print("Type the name for your pet: ");
                    name = kb.nextLine();
                }
                
                // Name by generator
                else {
                    
                    letter1 = rdm.nextInt(21);
                    if (rdm.nextInt(10) == 9) {
                        name = name + consonants.substring(letter1, letter1 + 1) + consonants.substring(letter1, letter1 + 1);
                    }
                    else {
                        name = name + consonants.substring(letter1, letter1 + 1);
                    }
                    
                    letter2 = rdm.nextInt(5);
                    if (rdm.nextInt(10) == 9) {
                        name = name + vowels.substring(letter2, letter2 + 1) + vowels.substring(letter2, letter2 + 1);
                    }
                    else {
                        name = name + vowels.substring(letter2, letter2 + 1);
                    }
                    
                    letter3 = rdm.nextInt(21);
                    if (rdm.nextInt(10) == 9) {
                        name = name + consonants.substring(letter3, letter3 + 1) + consonants.substring(letter3, letter3 + 1);
                    }
                    else {
                        name = name + consonants.substring(letter3, letter3 + 1);
                    }
                    
                    letter4 = rdm.nextInt(5);
                    if (rdm.nextInt(10) == 9) {
                        name = name + vowels.substring(letter4, letter4 + 1) + vowels.substring(letter4, letter4 + 1);
                    }
                    else {
                        name = name + vowels.substring(letter4, letter4 + 1);
                    }
                    
                }
                System.out.println("Your pet, named " + name + ", has been born!");
                
                System.out.println("");
                System.out.println("_________________________________________________________________________________________________________________");
                System.out.println("");
                
                // Maximum health, food, energy
                maxHealth = rdm.nextInt(21);
                maxFood = rdm.nextInt(21 - maxHealth);
                maxEnergy = 20 - maxHealth - maxFood;
                
                System.out.println("Maximum Health: " + maxHealth);
                System.out.println("Maximum Food: " + maxFood);
                System.out.println("Maximum Energy: " + maxEnergy);
                
            }
            else if ("1".equalsIgnoreCase(action) || "play".equalsIgnoreCase(action) || "interact".equalsIgnoreCase(action)) {
                System.out.println("");
                System.out.println("_________________________________________________________________________________________________________________");
                System.out.println(""); 
                
                System.out.println("Game 1 - Number Guessing Game");
                System.out.println("Instructions: You have 5 tries to guess a random number between 1-100.");
                
                rdmNum = rdm.nextInt(100) + 1;
                for (int guess = 4; guess > -1 && !(accurate); guess--) {
                    int userNum = kb.nextInt();
                    if (rdmNum > userNum) {
                        System.out.println("Too Low.");
                    }
                    else if (rdmNum < userNum) {
                        System.out.println("Too High.");
                    }
                    else {
                        accurate = true;
                        System.out.println("That is correct!!");
                    }
                }
                
            }
            else if ("3".equalsIgnoreCase(action) || "exit".equalsIgnoreCase(action)) {
            System.exit(0);
            }
        }
        System.out.println("That's wrong!! You have " + tries + " tries left. ");
        System.out.println("");
        System.out.println("_________________________________________________________________________________________________________________");
        System.out.println("");        
        }
    }
    
}
