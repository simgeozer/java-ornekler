
public class Main
{
	public static void main(String[] args) {
		int a[]={4,8,3,2,17,9,21,20,6,18};
		int i,size, count,sum,avg;
		size=10;
		count=0;
		sum=0;
		for (i=0;i<size;i=i+1)
		  if (a[i]%2!=0){
		      System.out.println(a[i]);
		      count=count+1;
		      sum=sum+a[i];
		  }
		
		avg=sum/count;
		
		
		System.out.println("teklerin sayisi:"+count);
		System.out.println("teklerin toplami:"  +sum+"ortalamasi: " +avg);
	}
}
