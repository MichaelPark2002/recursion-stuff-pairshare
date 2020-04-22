import java.util.Random;
public class WaveLength
{
    /**
     * Smoothes out an array by averaging values with its neighbors.
     * @param values an array
     * @param size the number of elements in values
     * @return void
     */
    
    /**
     * Prints an array
     * @param a an array
     */
    public void print(double[] a)
    {
        for(double d:a)
            System.out.println(d + " ");
    }
    
    public void smooth(double[] values, int size)
    {
        for(int i = 0; i < size - 1; i++)
        {
            double avg = (values[i] + values[i + 1]) / 2;
            values[i] = avg;
        }
    }
    
    public static void main(String[] args)
    {
        final int size = 100;
        double[] a = new double[size];
        Random generator = new Random();
        
        for(int i = 0; i < size; i++)
        {
            a[i] = 1 + i / 100.0;
            // Add some noise between -0.01 and .01
            a[i] = a[i] + (1 - 2 * (generator.nextDouble() * 1.0 / 10000)) / 100;
        }
        
        WaveLength wave = new WaveLength();
        wave.print(a);
        wave.smooth(a, size);
        System.out.println("\nAfter smoothing");
        wave.print(a);
    }
}