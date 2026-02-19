package Animals;

/**
 * The base class for all animal species within the Zoo Tycoon simulation.
 * <p>
 * This abstract class defines the common properties (like a name) and
 * behaviors (like feeding) that all specific animal types must share.
 * Because it is abstract, it cannot be instantiated on its own;
 * instead, it must be extended by concrete species classes.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public abstract class Animal {
    /**
     * The identifying name given to this specific animal instance.
     */
    public String name;

    /**
     * Constructs a new Animal instance with the provided name.
     *
     * @param name The unique identifier or name for this animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the animal.
     * * @return The name of the animal as a String.
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * An abstract method that simulates the process of feeding the animal.
     * <p>
     * Every concrete subclass (e.g., Tiger, Elephant) must provide its
     * own specific implementation of this method to describe how that
     * particular species is fed.
     * </p>
     */
    public abstract void feed();
}