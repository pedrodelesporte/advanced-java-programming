package Animals;

/**
 * Represents a Komodo Dragon within the zoo.
 * <p>
 * As a concrete subclass of {@link Reptile}, this class inherits the
 * standard reptilian feeding behaviors while providing specific
 * identification for Komodo Dragon instances.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public class Komodo extends Reptile {

    /**
     * Constructs a new Komodo instance and logs its arrival to the console.
     * <p>
     * This constructor utilizes the {@link Reptile} superclass to initialize
     * the animal's name and prints a confirmation message indicating the
     * successful addition of a new Komodo Dragon.
     * </p>
     * * @param name The unique name for this Komodo Dragon.
     */
    public Komodo(String name) {
        super(name);
        System.out.println("New animal created: " + this.name);
    }

    /**
     * Provides the name of the Komodo Dragon as its string representation.
     * * @return The name of this animal.
     */
    @Override
    public String toString() {
        return name;
    }
}