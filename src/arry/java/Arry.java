package arry.java;

public class Arry {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		
		for(int i= 0 ;i<arr.length;i++) {  			
			System.out.println(arr[i]+"index:"+i);
		}
		
		for(int i= arr.length-1; i>=0;i--)
		{
			if(i==4) {
				continue;
			}
			System.out.println(arr[i]+"index :"+i);			
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)					
		{
			sum=sum+arr[i];
			System.out.println(sum);
		}
		System.out.println("sum of arry elements"+sum);
	}
}
