package dataStructureInJava;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args){
		System.out.println("Main MEthod Started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int val = in.nextInt();
		int [] arr ={10,9,8,7,6,5,4,3,2,1};
		int [] sortArr = MySort.sortIt(arr);
		MySort.print(sortArr);
		int value =search(val, sortArr);
		biSearch(value, sortArr);
		System.out.println("Main MEthod Ended");
		
	}
	
	public static void biSearch(int val,int[] arr){
		int returned = search(val, arr);
		if(returned!=-1){
			System.out.println("Found at "+returned + "index");
		}
		else if(returned==-1){
			System.out.println("Element not found");
		}
	}
	public static int  search(int val,int[] arr){
		int low = 0;
		int high = arr.length-1;
		while(low!=high){
			int mid=(low+high)/2;
			if(arr[mid]==val){
				return mid;
			}
			else if(arr[mid]<val){
				low=mid+1;
			}
			else if(arr[mid]>val){
				high=mid;
			}
		}
		return -1;
	}
}
