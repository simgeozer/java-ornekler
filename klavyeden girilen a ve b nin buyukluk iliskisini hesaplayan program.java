/*a<b 
a=b 
a>b*/
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb= new java.util.Scanner(System.in);
	    int a,b;
	   	System.out.println("a için sayi giriniz:");
	   	a=kb.nextInt();
	   	System.out.println("b icin sayi giriniz:");
	   	b=kb.nextInt();
	   	
	   	if (a>b)
	   	  System.out.println(a+">"+b);
	   	else 
	       if (a==b)
	          System.out.println(a+"="+b);
	       else
	          System.out.println(a+"<"+b);
	          
	}
}
