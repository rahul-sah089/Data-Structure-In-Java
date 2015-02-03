package dataStructureInJava;

public class BubbleSort {
	public static void main(String[] args){
		System.out.println("Main MEthod Started");
		int[] arr ={90,23,45,12,65,23,78};
		System.out.print("The orginal string::");
		printArr(arr);
		int[] tempArr = cpArr(arr);
		tempArr =bubbleSort(tempArr);
		System.out.print("The Sorted string::");
		printArr(tempArr);
		System.out.println("Main MEthod Ended");
	}
	
	public static int[] cpArr(int[] arr){
		int length = arr.length;
		int[] tempArr = new int[length];
		for(int ii=0;ii<length;ii++){
		    tempArr[ii]=arr[ii];
		}
		return tempArr;
	}
	
	public static void printArr(int[] arr){
		int length = arr.length;
		for(int val : arr){
			System.out.print(val + "  ");
		}
		System.out.println();
	}
	
	public static int[] bubbleSort(int[] arr){
		int length = arr.length;
		for(int ii=0;ii<length;ii++){
			for(int jj=0;jj<length-ii-1;jj++){
				if(arr[jj]>arr[jj+1]){
					swap(jj,jj+1,arr);
				}
			}
		}
		return arr;
	}
	
	public static void swap(int ii,int jj,int[] arr){
		int temp;
		temp = arr[ii];
		arr[ii]=arr[jj];
		arr[jj]=temp;
	}

}
