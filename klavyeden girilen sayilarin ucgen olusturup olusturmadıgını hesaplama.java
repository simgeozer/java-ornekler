/*a+b>c 
a+c>b
b+c>a */
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


    if (a+b>c)
        if (a+c>b)
          if (a+c>a)
            System.out.println ("ucgendir");
          else
            System.out.println ("ucgen degildir");
        else 
          System.out.println("ucgen degildir");
    else 
     System.out.println ("ucgen degildir");

  }
}
