package Animals;

/**
 * An abstract intermediate class representing reptilian species in the zoo.
 * <p>
 * This class extends {@link Animal} and provides a specialized implementation
 * for the feeding behavior common to reptiles. While it implements
 * the abstract requirements of its parent, it remains abstract itself to
 * prevent generic "Reptile" objects from being created without a specific species.
 * </p>
 * * @author Pedro
 * @version 1.0
 */
public abstract class Reptile extends Animal {

    /**
     * Constructs a new Reptile instance.
     * <p>
     * This constructor passes the animal's name to the {@link Animal}
     * superclass for storage and management.
     * </p>
     *
     * @param name The name of the reptile.
     */
    public Reptile(String name) {
        super(name);
    }

    /**
     * Implements the feeding logic specifically for reptiles.
     * <p>
     * This method fulfills the contract defined in the {@link Animal} class.
     * It outputs a message indicating that the reptile is being fed insects.
     * </p>
     */
    @Override
    public void feed() {
        System.out.print("You feed the " + name + " some insects.\n");
    }
}