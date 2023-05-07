/*x,y 
x<y 
x<a[]<y */

public class Main
{
	public static void main(String[] args) {
		int a[]={4,8,3,2,17,9,21,20,6,18};
		java.util.Scanner kb=new java.util.Scanner(System.in);
		int i,size,x,y;
		size=10;
		
		System.out.print("x için sayi giriniz:");
		x=kb.nextInt();
		System.out.print("y için sayi giriniz:");
		y=kb.nextInt();
		
		for (i=0;i<size;i=i+1)
		  if (a[i]>x)
		    if (a[i]<y)
		      System.out.println(a[i]);
		      
	}
}
