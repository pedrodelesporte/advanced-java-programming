import Core.Zoo;
import UI.InputHandler;
import UI.Menu;

/**
 * The main entry point for the Zoo Tycoon simulation.
 * This class handles the primary application loop, user navigation through
 * the console-based menu, and coordinates interactions between the
 * UI and the Core logic of the zoo.
 * * @author Pedro
 * @version 1.0
 */
public class ZooTycoon {

    /**
     * The main execution loop of the application.
     * <p>
     * Displays a welcome message and repeatedly prompts the user for menu input
     * until the choice to exit is selected. This method manages the branching logic
     * for creating, deleting, listing, and feeding animals within the zoo.
     * </p>
     * *
     */
    public static void main(String[] args) {

        boolean running = true;

        Menu.printWelcome();

        while (running){

            Menu.print();

            int choice = InputHandler.getMenuChoice();

            switch (choice){
                case 1:
                    Zoo.createAnimal();
                    break;
                case 2:
                    Zoo.deleteAnimal();
                    break;
                case 3:
                    Zoo.listAnimals();
                    break;
                case 4:
                    Zoo.feedAnimals();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for playing!");
                    break;
            }
        }

        // Ensure resources are properly released before exit
        InputHandler.CloseScanner();
    }
}