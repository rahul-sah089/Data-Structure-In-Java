package dataStructureInJava;

import java.util.Scanner;

public class TestBinarySearch {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		System.out.println("Enter the element to find");
		Scanner in = new Scanner(System.in);
		int value=in.nextInt();
		int[] arr ={12,23,34,4,67,67};
		int len = arr.length;
		int[] tempArr = new int[len];
		for(int ii=0;ii<len;ii++){
			tempArr[ii]=arr[ii];
		}
		System.out.println(bSearch(tempArr,value));
		System.out.println("Main Method Ended");
	}
	public static String bSearch(int[] arr,int value){
		boolean status = false;
		int index=0;
		String str=null;
		for(int ii=0;ii<arr.length;ii++){
			if(arr[ii]==value){
				status=true;
				index=ii;
			}
		}
		if(status==true){
			str="The lement found at index::"+index;
		}
		else if(status==false){
			str="The element is not found";
		}
		return str;
	}
}
