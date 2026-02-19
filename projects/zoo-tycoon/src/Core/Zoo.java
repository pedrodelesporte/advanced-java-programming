package Core;

import Animals.*;
import UI.InputHandler;
import UI.Menu;
import java.util.ArrayList;

/**
 * The central controller for the Zoo Tycoon simulation.
 * <p>
 * This class manages the collection of all animals using a dynamic
 * {@link ArrayList}. It provides the core functionality to create,
 * delete, list, and interact with animal objects.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public class Zoo {

    /**
     * A dynamic list storing all animal instances currently in the zoo.
     * This uses polymorphism to store any object that extends the {@link Animal} class.
     */
    static ArrayList<Animal> animals = new ArrayList<>();

    /**
     * Facilitates the creation of new animal objects based on user input.
     * <p>
     * This method displays the available animal types, captures the user's choice,
     * and adds the corresponding concrete animal instance (e.g., Tiger, Boa)
     * to the zoo's collection.
     * </p>
     */
    public static void createAnimal() {
        System.out.println("You have chosen to create a new animal. Select your animal:");
        Menu.animalList();
        int choice = InputHandler.getMenuChoice();
        switch (choice){
            case 1:
                animals.add(new Tiger("Tiger"));
                break;
            case 2:
                animals.add(new Elephant("Elephant"));
                break;
            case 3:
                animals.add(new Komodo("Komodo Dragon"));
                break;
            case 4:
                animals.add(new Boa("Boa Constrictor"));
                break;
        }
    }

    /**
     * Removes an animal from the zoo based on its position in the list.
     * <p>
     * Displays the current list of animals, prompts for an index, and
     * removes the selected animal from the {@code animals} ArrayList.
     * </p>
     * *
     */
    public static void deleteAnimal(){
        System.out.println("You have chosen to delete the animal. Select your animal:");
        listAnimals();

        // Adjusting for 1-based indexing shown to the user
        int choice = InputHandler.getInt() - 1;

        if (choice >= 0 && choice < animals.size()) {
            System.out.println("Animal " + animals.get(choice) + " has been deleted.");
            animals.remove(choice);
        } else {
            System.out.println("Invalid selection. No animal was removed.");
        }
    }

    /**
     * Iterates through the entire collection and prints each animal to the console.
     * <p>
     * Displays the total count of animals and assigns a 1-based ID to each
     * for easier user interaction.
     * </p>
     */
    public static void listAnimals(){
        System.out.println("You now have " + animals.size() + " animals in the Zoo.");
        for (int i = 0; i < animals.size(); i++){
            System.out.println("[" + (i + 1) + "] " + animals.get(i));
        }
    }

    /**
     * Executes the {@code feed()} method for every animal in the zoo.
     * <p>
     * This method demonstrates <b>Polymorphism</b>: it calls the generic
     * {@code animal.feed()} method, but Java automatically executes the
     * specific implementation (Mammal or Reptile) based on the actual
     * object type in the list.
     * </p>
     */
    public static void feedAnimals(){
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}