
public class Main
{
  public static void main (String[]args)
  {
    java.util.Scanner kb = new java.util.Scanner (System.in);
    int a,b,c;

      System.out.println ("a icin bir sayi giriniz:");
      a = kb.nextInt ();
      System.out.println ("b icin bir sayi giriniz:");
      b = kb.nextInt ();
      System.out.println ("c icin bir sayi giriniz:");
      c = kb.nextInt ();


    if (a==b)
        if (b!=c)
            System.out.println ("eskenar ucgendir");
        else
            System.out.println ("eskenar ucgen degildir");
        
    else 
     System.out.println ("eskenar ucgen degildir");

  }
}
