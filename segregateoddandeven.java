package Programs;

public class segregateoddandeven {

	public static void main(String[] arg)
	{
		int value[] ={1,3,5,2,4,6};
		segregate(value);
		System.out.print("Array after segregation "); 
		for (int i = 0; i < value.length; i++) 
			System.out.print(value[i]+" ");
	}
	public static void segregate(int arr[]){

		int left = 0 , right = arr.length -1 ;

		while (left < right){


			// increment the left index when we see 0 at left
			if (arr[left]%2==0 && left < right)
				left ++;



				// decrement the right index when we see 1 at right
				if(arr[right]%2==1 && left < right)

					right --;


					if(left < right)
					{
						int temp = arr[left];
						arr[left] = arr[right];
						arr[right]= temp;
						left++;
						right--;


					}

				}


			}


	

	}
