
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	   int a,b;
	   System.out.print("a icin sayi giriniz:");
	   a=kb.nextInt();
	   
	   System.out.print("b icin sayi giriniz:");
	   b=kb.nextInt();
	   
	   if (a%b==0)
	     System.out.println("tam katidir");
	   else 
	     System.out.println("tam kati degildir");
	}
}
