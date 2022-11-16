package Sorting;

import java.util.Scanner;

public class BinaryTree {
	static int count = 0 ;
	public static boolean binarySearch(int[] array,int low,int hight, int key) {
		
		if(low > hight)
			return false ;
		
		int mid = (low+hight) /2 ;
		if(array[mid] < key) {
			return binarySearch(array, low, mid-1, key) ;
		}else if(array[mid] > key) {
			return binarySearch(array, mid+1, hight, key) ;
		}else
			return true ;
		
	}
	public static void main(String[] args) {
		int array[] = {80, 73, 60, 55, 51, 30, 22, 10};
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Ahmed has a number is : ");
		int x = input.nextInt() ;
		if(binarySearch(array, 0, array.length-1, x)) 
			System.out.println("Yes he is on the list");
		else
			System.out.println("is not here");
	}

}
