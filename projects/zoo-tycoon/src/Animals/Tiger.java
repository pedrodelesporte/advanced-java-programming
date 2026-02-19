package Animals;

/**
 * Represents a Tiger in the zoo simulation.
 * <p>
 * This class is a concrete implementation of a {@link Mammal}. While it
 * currently shares the general mammalian feeding habits, it can be
 * specialized further in the future to reflect a carnivore's diet.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public class Tiger extends Mammal {

    /**
     * Constructs a new Tiger with the specified name and logs its arrival.
     * <p>
     * Invokes the {@link Mammal} constructor and outputs a notification
     * to the console confirming the tiger's creation.
     * </p>
     * * @param name The name given to this tiger.
     */
    public Tiger(String name) {
        super(name);
        System.out.println("New animal created: " + name);
    }

    /**
     * Returns the identifying name of the tiger.
     * * @return The name of the tiger as a String.
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Executes the feeding process for the tiger.
     * <p>
     * This implementation specifically calls {@code super.feed()},
     * utilizing the standard feeding behavior defined in the
     * {@link Mammal} class.
     * </p>
     */
    @Override
    public void feed() {
        super.feed();
    }
}