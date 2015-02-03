package dataStructureInJava;

public class MySort {
    public static void main(String args[]){
    	System.out.println("Main Method Started");
    	
    	int[] arr = {12,14,98,9,8,7,6};
    	int length = arr.length;
    	int[] tempArr = new int[length];
    	for(int i=0;i<length;i++){
    		tempArr[i]=arr[i];
    	}
    	for(int i=0;i<length;i++){
    		for(int j=i+1;j<length;j++){
    			if(tempArr[i]>tempArr[j]){
    				int temp=tempArr[i];
    				tempArr[i]=tempArr[j];
    				tempArr[j]=temp;
    			}
    		}
    	}
    	System.out.println("Sorted Arr is::");
    	for(int val :tempArr){
    		System.out.println(val);
    	}
    	System.out.println("Main MEthod Ended");
    }
}
