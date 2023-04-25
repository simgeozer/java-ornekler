/*(0<n<100*/
public class Main
{
  public static void main (String[]args)
  {
    java.util.Scanner kb = new java.util.Scanner (System.in);
    int n;

      System.out.println ("bir sayi giriniz:");
      n = kb.nextInt ();


    if (n / 10 < 1)
        System.out.println ("sayi bir basamaklidir");
    else
      if (n / 10 < 10)
        System.out.println ("sayi iki basamaklidir");
      else
    
    if (n / 10 < 100)
        System.out.println ("sayi uc basamaklidir");

  }
}
