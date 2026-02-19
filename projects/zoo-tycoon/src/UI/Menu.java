package UI;

/**
 * Handles the console-based user interface for the Zoo Tycoon application.
 * This class provides static methods to display welcome messages, the main
 * navigation menu, and the list of available animal types.
 * * @author Pedro
 * @version 1.0
 */
public class Menu {

    /**
     * Displays a one-time welcome greeting to the user at the start of the application.
     */
    public static void printWelcome(){
        System.out.println("Welcome to the Zoo Tycoon!");
    }

    /**
     * Prints the main operational menu to the console.
     * <p>
     * Provides options for animal management including creation, deletion,
     * listing, and feeding, as well as the option to exit the program.
     * </p>
     */
    public static void print() {
        System.out.println(
                "\nPlease select from the following menu of options:\n" +
                        "1. Create new animal.\n" +
                        "2. Delete animal.\n" +
                        "3. List all animals in zoo.\n" +
                        "4. Feed all animals in zoo.\n" +
                        "5. Exit."
        );
    }

    /**
     * Displays the specific list of animal species that a user can choose to
     * add to the zoo.
     * <p>
     * Currently supports: Tigers, Elephants, Komodo Dragons, and Boa Constrictors.
     * </p>
     */
    public static void animalList() {
        System.out.println("1. Tiger\n" +
                "2. Elephant\n" +
                "3. Komodo Dragon\n" +
                "4. Boa Constrictor\n"
        );
    }
}