
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BigInteger a,b,c;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
           a = in.nextBigInteger();
           b = in.nextBigInteger();
           c = a.multiply(b);
            System.out.println(c);
        }
	}
}
