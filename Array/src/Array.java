import java.util.*;

public class Array {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
	}
	
	public void arrayDemo() {
		int[] myArray = new int[5]; // default values
		// printArray(myArray);
		myArray[0] = 5;
		myArray[1] = 1;
		myArray[2] = 8;
		myArray[3] = 2;
		myArray[4] = 10;
		myArray[2] = 9;
		printArray(myArray);
		int[] anewArray3 = {5, 1, 8, 10};
		printArray(anewArray3);
		
		
	}
	
	// Reverse an array method
	public static void reverseArray(int numbers[], int start, int end) {
		while(start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
	
	// Find minimum value in an array // Non-static associated with an object
	public int findMinimum(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int min = arr[0];
		for(int i = 1; i <arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	// Resize array method
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr  = temp;
		return arr;
		
		
	}

	
	// Merge two sorted arrays
	public int[] merge(int[] arr1, int[] arr2, int n, int m) {
		int[] result = new int[n + m];
		int i = 0; // traverse arr1
		int j = 0; // traverse arr2
		int k = 0; // traverse result (merged final array)
		
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			}
			else {
				result[k] = arr2[j];
				j++; 
			}
			k++;
		}
		// After i or j exceeds array bounds, we need to fill in final result array
		while(i < n) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j < m) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}
	
	// Linear search algorithm
	public int LinearSearch(int[] arr, int n, int x) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
		
	}
	
	// Binary search algorithm // Has to be sorted
	public int binarySearch(int[] nums, int key) {
		int low = 0;
		int high = (nums.length - 1);
		while(low <= high) {
			int mid = (high + low) / 2;
			if(nums[mid] == key) {
				return mid; // Returns middlex index which matched the key
			}
			if(key < nums[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1; // Means we didn't find the key we were looking for
	}
	
	
	// Bubble sort algorithm
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean isSwapped;
		
		for(int i = 0; i < n - 1; i++) {
			isSwapped = false;
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
					
				}
				
			}
			if(isSwapped == false) {
				break;
			}	
		}	
	}
	
	// Insertion sort algorithm
	public void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = temp;
			
		}
	}
	
	
	// Selection sort algorithm
	public void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	// Main method or entry point to our program
	public static void main(String[] args) {
		// Implement an array here, and instantiate respective Array class to access/test non-static methods/algorithms
	}
}
















