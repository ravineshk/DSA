package Recursion.ArrayRecursionAssignment;



public class HighestElement {
    static void greater(int arr[], int index, int Greater) {
		
		// base case
		if(arr.length == index) {
			System.out.println(Greater);
			return ;
		}
		
		// buisness logic
		if(arr[index] > Greater) {
			Greater = arr[index];
		}
		
		// small problem
		
		greater(arr, index+1, Greater);
		
	}
	
 static int greater(int arr[], int index) {
		
		// base case
		if(arr.length == index) {
			return 0;
		}
		
		// small problem
		int Greater = greater(arr, index+1);
				
		
		// buisness logic
		if(arr[index] > Greater) {
			Greater = arr[index];
		}
		return Greater;
	}

public static void main(String[] args) {
    int arr[] = { 50, 20, 30, 70, 10};
		int index = 0;
		int Greater = 0;
		
		// stack building
		greater(arr, index, Greater);
		
		// stack falling
		System.out.println(greater(arr, index));
}
}  

