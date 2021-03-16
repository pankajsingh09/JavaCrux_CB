package Functions_and_Arrays;

import java.util.Scanner;

public class Sorting {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = takeinput();
//		bubblesort(arr);
//		selectionsort(arr);
//		insertionsort(arr);
//		display(arr);
		System.out.println("Enter the element to be found ");
		int data = sc.nextInt();
		System.out.println("the lower bound is at index  " + lowerbound(arr, data));
		System.out.println("the higher  bound is at index  " + higherbound(arr, data));

	}

	public static int[] takeinput() {
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[] bubblesort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void insertionsort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i];
			int j = i - 1;
			while (j > -1 && val < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			/*
			 * for(;j>-1;j--) { if(val<arr[j]) { arr[j+1]=arr[j]; } else { break; } }
			 */

			arr[j + 1] = val;
		}
	}

	public static int lowerbound(int[] arr, int data) {
		int l = 0, h = arr.length - 1, ans = -1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == data) {
				ans = mid;
				h = mid - 1;
			} else if (arr[mid] < data) {
				h = mid - 1;
			} else
				l = mid + 1;
		}
		return ans;
	}

	public static int higherbound(int[] arr, int data) {
		int l = 0, h = arr.length - 1, ans = -1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == data) {
				ans = mid;
				l = mid + 1;
			} else if (arr[mid] < data) {
				h = mid - 1;
			} else
				l = mid + 1;
		}
		return ans;
	}

	public static void display(int[] arr) {
		System.out.println("The sorted array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
