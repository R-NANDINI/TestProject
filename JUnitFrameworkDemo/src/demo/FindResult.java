package demo;

public class FindResult {
	public final Object FindMaxNum = null;

	public static int FindMaxNum(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	public static boolean EvenOrOdd(int n)
	{
		if(n%2==0)
			return true;
		return false;
	}
}
