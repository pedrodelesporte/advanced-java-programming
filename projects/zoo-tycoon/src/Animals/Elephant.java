package Animals;

/**
 * Represents an Elephant within the zoo simulation.
 * <p>
 * This class is a concrete implementation of a {@link Mammal}. It
 * manages the specific lifecycle of elephant instances, inheriting
 * basic mammalian traits and behaviors.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public class Elephant extends Mammal {

    /**
     * Constructs a new Elephant with a unique name and logs its creation.
     * <p>
     * This constructor invokes the {@link Mammal} superclass constructor
     * to initialize the name and prints a confirmation message to the
     * console for tracking purposes.
     * </p>
     * * @param name The identifying name for this elephant.
     */
    public Elephant(String name) {
        super(name);
        System.out.println("New animal created: " + name);
    }

    /**
     * Returns the elephant's name as its string representation.
     * * @return The name of this elephant instance.
     */
    @Override
    public String toString() {
        return name;
    }
}