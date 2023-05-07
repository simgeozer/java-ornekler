
public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int a[]={4,2,8,3,1,19,9,5,15,20};
	    int n,i,size;
	    size=10;
		System.out.print("n icin sayi giriniz:");
		n=kb.nextInt();
		 for (i=0;i<size;i=i+1)
		   if (a[i]<n)
		    if (a[i]%2 !=0)
		    System.out.println(a[i]);
	}
}
