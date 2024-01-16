
/**
 * Represents a single baked good in our bakery's inventory
 *
 * @author (Wintersession 2024)
 * @version (01/16/2024)
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity= quantity;
    }
    
    
}