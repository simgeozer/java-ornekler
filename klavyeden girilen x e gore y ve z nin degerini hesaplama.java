
public class Main
{
  public static void main (String[]args)
  {
    java.util.Scanner kb = new java.util.Scanner (System.in);
    int x, y, z;

      System.out.print ("x i giriniz:");
      x = kb.nextInt ();

    if (x < 0)
      {
	y = x * x + 10;
	z = 3 * x;
      }
    else
      {
	y = x;
	z = x * x + 2 * x;
      }
    System.out.println ("y: " + y + "z: " + z);

  }
}
