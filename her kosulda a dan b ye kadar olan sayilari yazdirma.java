/* a<b,a=b,a>b*/
                   
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int i,a,b;
	    
	    System.out.print("lütfen a için sayi girin:");
	    a=kb.nextInt();
	    System.out.print("lütfen b için sayi girin:");
	    b=kb.nextInt();
	    
	    if (a<b)
	       for (i=a;i<=b;i=i+1)
		   System.out.println(i);
		else 
		   for (i=a;i>=b;i=i-1)
		   System.out.print(i);
		
	}
}
