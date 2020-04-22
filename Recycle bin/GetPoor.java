
/**
 * Collects money through recursion
 *
 * @Adrian Tse
 * @04/16/2020
 */
public class GetPoor
{
    public static int collect(int amt)
    {
        if(amt > 1)
        {
            System.out.println("They call in 10 people to collect " + (amt / 10) + "¢.");
            System.out.println(amt + "¢ = " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + " + (amt / 10) + "¢ + ");
            return(collect(amt / 10));
        }
        else
            return 0;
    }

    public static void main(String[] args)
    {
        collect(1000);
    }
}
/* OUTPUT:

They call in 10 people to collect 100¢.
1000¢ = 100¢ + 100¢ + 100¢ + 100¢ + 100¢ + 100¢ + 100¢ + 100¢ + 100¢ + 100¢ +
They call in 10 people to collect 10¢.
100¢ = 10¢ + 10¢ + 10¢ + 10¢ + 10¢ + 10¢ + 10¢ + 10¢ + 10¢ + 10¢ +
They call in 10 people to collect 1¢.
10¢ = 1¢ + 1¢ + 1¢ + 1¢ + 1¢ + 1¢ + 1¢ + 1¢ + 1¢ + 1¢ +
Press any key to continue . . .
*/