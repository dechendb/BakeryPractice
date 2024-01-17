
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
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity= quantity;
    }
    
    /**
     * Modify the quantity of goods: baking more --> increasing the number of goods
     * 
     *  param: the amount by which we are increasing the count
     *  return: nothing
     *  
     */
    public void IncreaseQuant (int count) {
        this.quantity += count;
    }

    /**
     * Instance method to allow for buying baked goods
     * 
     *  param: the count (number) of items being bought
     *  return: total cost
     *  
     */
    public double Purchase(int count) {
        if (count > this.quantity){
            throw new IllegalArgumentException("You're asking for more than what we have!");
        }
        this.quantity -= count;
        return this.price *count;
    }
    
    /**
     * toString
     * 
     * param: nothing
     * return: String representation of our work
     */
    public String toString(){
        return "Baked Good:  " + this.name + " (" +this.quantity +","+ " @" + "$"+this.price+ ")";
    }
    
    /**
     * Main
     * 
     * Where we can test our menthods
     */
    public static void main(String[] args) {
        BakedGood crossiant = new BakedGood ("crossiant", "butter, flour, bake, yummers", 20.0, 0);
        
        //bake a dozen more crossiants
        crossiant.IncreaseQuant(12);
        
        System.out.println(crossiant);
        
        //bake 3 more crossiants with leftover dough
        crossiant.IncreaseQuant(3);
        System.out.println(crossiant);

        System.out.println(crossiant.Purchase(3));
        System.out.println(crossiant);        
        
    }
}
