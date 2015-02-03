package dataStructureInJava;

public class MySort {
    public static void main(String args[]){
    	System.out.println("Main Method Started");
    	int [] arr = {12,11,10,9,8,7,6,5,4,3,2,1};
    	System.out.println("The original arr::");
    	print(arr);
    	int[] tempArr = cpArr(arr);
    	tempArr = sortIt(tempArr);
    	System.out.println("The Sorted arr::");
    	print(tempArr);
    	System.out.println("Main MEthod Ended");
    }
    public static int[] cpArr(int[] arr){
    	int[] tempArr = new int[arr.length];
    	for(int ii=0;ii<arr.length;ii++){
    		tempArr[ii]=arr[ii];
    	}
    	return tempArr; 
    }
    public static void print(int[] arr){
    	for(int val:arr){
    		System.out.print(val + "  ");
    	}
    	System.out.println();
    }
    public static int[] sortIt(int[] args){
    	int length = args.length;
    	for(int ii=0;ii<length;ii++){
    		for(int jj=ii+1;jj<length;jj++){
    			if(args[ii]>args[jj]){
    				int temp=args[ii];
    				args[ii]=args[jj];
    				args[jj]=temp;
    			}
    		}
    	}
    	return args;
    }
}
