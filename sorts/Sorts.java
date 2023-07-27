package sorts;

public class Sorts {

	
	public static void swap(int[] arr,int x,int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void bubbleSort(int [] arr) {
		
		int passes=arr.length-1;
		int comps = arr.length-1;
		
		for(int i=0;i<passes;i++) {
			for(int j=0;j<comps-i;j++) {
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
		}
	}
	
	public static void selectionSort(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i])
					min=j;
			}
			if(min != i)
				swap(arr,i,min);
		}
	}
	
	public static void insertionSort(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i])
					swap(arr,j,i);
			}
		}
	}
	
	
	    public static void quickSort(int []arr,int left,int right){
	    	
	    	if(left>=right)
	    		return;
	    	
	    	int i=0,j=right;
	    	
	    	while(i<j) {
	    		while(i<=right && arr[i]<=arr[left])
	    			i++;
	    		
	    		while(arr[j]>arr[left])
	    			j--;
	    		
	    		if(i<j)
	    			swap(arr,i,j);
	    	}
	    	swap(arr,j,left);
	    	quickSort(arr,left,j-1);
	    	quickSort(arr,j+1,right);

	      }
	    
	    
	    
}
