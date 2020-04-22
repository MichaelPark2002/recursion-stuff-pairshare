
/**
 * Invoice class, calculates the total and discounts
 *
 * @Adrian Tse
 * @04/20/20
 */
import java.util.ArrayList;
public class Invoice
{
    private ArrayList<Item> items = new ArrayList<>();
    private double itemTotal = 0.0;
    private double petTotal = 0.0;
    private int itemCount = 0;
    private int petCount = 0; 
    
    public Invoice()
    {
        
    }
    
    public void add(Item anitem)
    {
        items.add(anitem);
        if(anitem.isPet())
        {
            petCount += anitem.getQuantity();
            petTotal += anitem.getPrice() * petCount;
        }
        else
        {
            itemCount += anitem.getQuantity();
            itemTotal += anitem.getPrice() * itemCount;
        }
    }
    
    public double getDiscount()
    {
        if(itemCount >= 5 && petCount >= 1)
            return itemTotal * 0.2;
        else
            return 0;
    }
    
    public double getTotal()
    {
        return itemTotal + petTotal;
    }
}
