package Recursion.SelfPractise_Recursion;

public class ReplaceValue {
    static void replaceAll(int[] array, int target, int replacement, int i) {
	        if (i == array.length) {
	            return;
	        }
	        
	        if (array[i] == target) {
	            array[i] = replacement; // replacing with 10
	        }
	        
	        replaceAll(array, target, replacement, i + 1);
	    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int replace = 10;
        
        replaceAll(array, target, replace, 0);
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
