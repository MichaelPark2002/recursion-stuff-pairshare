
/**
 * Item class, contains data of each item
 *
 * @Adrian Tse
 * @04/20/20
 */
public class Item
{
    double price;
    boolean isPet;
    int quantity;
    
    public Item(double price, boolean isPet, int quantity)
    {
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public boolean isPet()
    {
        return isPet;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
