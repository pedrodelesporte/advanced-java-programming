package UI;

import java.util.Scanner;

/**
 * Utility class for managing user input via the console.
 * This class maintains a single {@link Scanner} instance to be used
 * throughout the application.
 * * @author Pedro
 * @version 1.0
 */
public class InputHandler {

    /**
     * The primary Scanner instance used for reading system input.
     */
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Reads the next integer value provided by the user in the console.
     * * @return The integer value entered by the user.
     */
    public static int getInt(){
        return scanner.nextInt();
    }

    /**
     * Prompts the user with a visual indicator and retrieves their menu selection.
     * * @return The integer corresponding to the user's chosen menu option.
     */
    public static int getMenuChoice(){
        System.out.print("> ");
        return getInt();
    }

    /**
     * Closes the underlying {@link Scanner} resource.
     * <p>
     * This should be called only when the application is terminating to
     * prevent further input attempts.
     * </p>
     */
    public static void CloseScanner(){
        scanner.close();
    }
}