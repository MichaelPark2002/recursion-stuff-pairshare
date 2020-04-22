
/**
 * Crash your IDE by running an infinite loop of squaring 2 and squaring the value over and over until it becomes unresponsive
 */
public class CrashMyIDE
{
    public static void main(String[] args)
    {
        int l = 2;
        while(true)
        {
            System.out.println(l);
            l = (int)Math.pow(l, 2);
        }
    }
}
