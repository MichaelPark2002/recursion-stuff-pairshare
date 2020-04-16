
/**
 * Write a description of class PartOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a function using recursion to print numbers from n to 0
 * Write a function using recursion to print numbers from 0 to n (you just need to change one line in the program of problem 1).
 * Write a function using recursion that takes in a string and returns a reversed copy of the string. The only string operation you are allowed to use is string concatenation. Then test if user inputted String is a palindrome.
 * Write a function using recursion to check if a number n is prime (you have to check whether n is divisible by any number below n)
 */
public class PartOne
{
    public static void f1(int n)
    {
        if(n >= 0)
        {
            System.out.println(n);
            f1(n - 1);
        }
    }
    
    public static void f2(int n)
    {
        if(n >= 0)
        {
            f2(n - 1);
            System.out.println(n);
        }
    }
    
    public static String backwards(String s) //surely it shouldn't be so complicated but I couldn't figure it out.
    {
        return(reverser(s, "", s.length() - 1));
    }
    
    public static String reverser(String oldS, String newS, int i)
    {
        if(i >= 0)
        {
            return(reverser(oldS, newS + oldS.charAt(i), i - 1));
        }
        else
            return newS;
    }
    
    public static boolean palindrome(String s)
    {
        return s.equals(backwards(s));
    }
    
    // DOES NOT WORK!!!!
    // public static boolean palindrome(String s, int l, int i)
    // {
        // System.out.println("i: " + i);
        // if(i <= l / 2 && s.charAt(i) == s.charAt(s.length() - i))
        // {
            // return palindrome(s, l, i - 1);
        // }
        // else if(s.charAt(i) == s.charAt(s.length() - i))
        // {
            // System.out.println("else if");
            // return true;
        // }
        // else
        // {
            // System.out.println("else");
            // return false;
        // }
    // }
    
    public static void main(String[] args)
    {
        System.out.println(palindrome("racecar"));
    }
}
