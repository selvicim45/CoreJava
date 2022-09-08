package weekThreeSecond;

public class RotateArray {
	
	//non-static method with input of array and rotating number
	public void rotate(int[] nums, int k) {
		System.out.println(nums.length);
		if (k > nums.length) 
			k= k% nums.length;
		
			int[] result = new int [nums.length];
			for(int i=0;i<k;i++)
			{
				result[i]= nums[nums.length - k+i];
				//System.out.println("Hello testing" + result[0]);
			}
			int j=0;
			for(int i=k; i < nums.length;i++)
			{
				result[i]= nums[j];
				j++;
			}
				System.arraycopy(result, 0, nums, 0, nums.length);
			}
			
		     
	
	public static void main(String[] args)
	{
		RotateArray r = new RotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		r.rotate(arr, 4);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		//input: 1 2 3 4 5 6 7  Rotating no:4
		//Output: 4 5 6 7 1 2 3
		
	}

}
