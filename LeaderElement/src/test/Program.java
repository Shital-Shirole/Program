package test;

public class Program {
	public static void main(String[] args) {
		int arr [] = {15,16,3,5,2,4,3};
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = true;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])	
				{
					flag = false;
					break;
				}	
			}
			if(flag)
				System.out.print(arr[i]+" ");
		}
	}
}
