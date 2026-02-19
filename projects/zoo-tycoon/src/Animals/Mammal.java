package Animals;

/**
 * An abstract intermediate class representing mammal species in the zoo.
 * <p>
 * This class extends {@link Animal} and defines a shared feeding behavior
 * common to mammals within the simulation. As an abstract class, it
 * cannot be instantiated directly and serves as a blueprint for
 * concrete species like Tigers or Elephants.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public abstract class Mammal extends Animal {

    /**
     * Constructs a new Mammal instance.
     * <p>
     * Passes the animal's name to the {@link Animal} superclass constructor.
     * </p>
     * * @param name The name of the mammal.
     */
    public Mammal(String name) {
        super(name);
    }

    /**
     * Implements the feeding logic specifically for mammals.
     * <p>
     * Overrides the abstract {@link Animal#feed()} method to provide a
     * diet consisting of meat and vegetables.
     * </p>
     */
    @Override
    public void feed() {
        System.out.print("You feed the " + name +
                " a mix of meat and vegetables.\n");
    }
}