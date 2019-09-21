package dataStructure;
import java.util.Scanner;
// Compare 2 arrays

public class ArrayEqual
{
  // Are all elements in two arrays a and b the same?
  static boolean equals (int[]a, int[]b)
  {
    if (a.length != b.length)
      return false;

    for (int i = 0; i < a.length; i++)
      if (a[i] != b[i])
	return false;

    return true;
  }

  public static void main (String[]args)
  {
    Scanner stdIn = new Scanner (System.in);
    int numA, numB;

    do
      {
	System.out.print ("The number of elements in Array a : ");
	numA = stdIn.nextInt ();	// The number of elements
      }
    while (numA <= 0);

    int[] a = new int[numA];	// Create an array with the number of elements numA

    for (int i = 0; i < numA; i++)
      {
	System.out.print ("a[" + i + "] : ");
	a[i] = stdIn.nextInt ();
      }

    do
      {
	System.out.print ("The number of elements in Array b : ");
	numB = stdIn.nextInt ();	// The number of elements
      }
    while (numB <= 0);

    int[] b = new int[numB];	// Array with the number of elements numB

    for (int i = 0; i < numB; i++) {
        System.out.print("b[" + i + "] : ");
        b[i] = stdIn.nextInt();
    }
    
    System.out.println("Arrays a and b are " +
                        (equals(a, b) ? "the same."
                                      : "not the same."));
  }
}
