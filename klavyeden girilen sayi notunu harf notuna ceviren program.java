
public class Main
{
  public static void main (String[]args)
  {
    java.util.Scanner kb = new java.util.Scanner (System.in);
    int n;

      System.out.println ("not giriniz:");
      n = kb.nextInt ();
      if (n>80)
        System.out.print("A");
      else 
        if (n>60)
          System.out.print("B");
        else 
          if (n>40)
            System.out.print("C");
          else 
            if (n>20)
              System.out.print("D");
            else 
              System.out.print("E");
     

  }
}
