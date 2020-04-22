
/**
 * Main class for the Pet Shop assignment
 *
 * @Adrian Tse
 * @04/20/20
 */
import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        Invoice inv = new Invoice();

        double price = 0;
        String isPetyn = "n";
        boolean isPet = false;
        int quantity = 0;
        Scanner kb = new Scanner(System.in);
        while(price != -1)
        {
            System.out.println("Enter price: ");
            price = kb.nextDouble();
            if(price == -1)
                break;
            System.out.println("Is pet [y/n]: ");
            isPetyn = kb.next();
            if(isPetyn.equals("y"))
                isPet = true;
            else
                isPet = false;
            System.out.println("Enter quantity: ");
            quantity = kb.nextInt();
            inv.add(new Item(price, isPet, quantity));

        }

        double total = inv.getTotal();
        double discount = inv.getDiscount();

        System.out.println("Total: $" + total + "\nDiscount: -$" + discount + "\nFinal: $" + (total - discount));
    }
}
