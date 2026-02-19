package Animals;

/**
 * Represents a Boa Constrictor in the zoo.
 * <p>
 * This class is a concrete implementation of a {@link Reptile}. It handles
 * the specific initialization and identification of Boa instances within
 * the simulation.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public class Boa extends Reptile {

    /**
     * Constructs a new Boa with a specific name and logs its creation.
     * <p>
     * This constructor calls the superclass constructor in {@link Reptile}
     * and prints a confirmation message to the console indicating the
     * animal has been successfully added.
     * </p>
     * * @param name The unique name to be assigned to this Boa.
     */
    public Boa(String name) {
        super(name);
        System.out.println("New animal created: " + name);
    }

    /**
     * Returns the name of the Boa for display purposes.
     * * @return The string representation of this specific animal.
     */
    @Override
    public String toString() {
        return name;
    }
}