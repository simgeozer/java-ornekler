/*a<b 
a dahil edilmeseydi
for (a=a;i<=b;i=i=i+1)
System.out.print(i);
b yi dahil etmeseydik:
for (i=a;i<b;i=i+1);
*/
                   
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int i,a,b;
	    
	    System.out.print("lütfen a için sayi girin:");
	    a=kb.nextInt();
	    System.out.print("lütfen b için sayi girin:");
	    b=kb.nextInt();
	    
	    for (i=a;i<=b;i=i+1)
		System.out.println(i);
		
		
	}
}
