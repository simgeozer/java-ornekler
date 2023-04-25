/*(a<n<100*/
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb= new java.util.Scanner(System.in);
	    int n;
	    
	   	System.out.println("bir sayi giriniz:");
	   	n=kb.nextInt();
	   	
	   	
	   	if (n>0)
	   	   if (n<100)
	   	     System.out.println("arasindadir");
	   	   else 
	   	     System.out.println("arasinda degildir");
	   	else
	   	  System.out.println("arasinda degildir");
	   	  
	}
}
