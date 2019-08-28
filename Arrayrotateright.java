package Programs;

public class Arrayrotateright {
	
	public static void main(String[] arg){
		// declaration
		int[] arr = {2,3,4,1};
		int n = 2; 
		
		// Display the crruent array 
		
		for(int i=0; i <arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		// rotate the given array towards right
		
		for(int i= 0 ; i < n ; i ++){
			
			int j, last;
			last =arr[arr.length-1];
			
			for(j=arr.length-1; j>0 ; j--){
				arr[j]=arr[j-1];
			}
			arr[0]= last;
			System.out.println();
			System.out.println("Array after "+i+" rotation");    
	        for(int k = 0; k< arr.length; k++){    
	            System.out.print(arr[k]+" "); 
	        }
		}
		System.out.println();
		System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    
	}

	}
}
	
