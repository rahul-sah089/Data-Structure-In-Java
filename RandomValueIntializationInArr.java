package dataStructureInJava;

import java.util.Random;
import java.util.Scanner;

public class RandomValueIntializationInArr {
	private static Random random = new Random();
	public static void main(String[] args){
		
		System.out.println("Main MEthod Started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the arr");
		int range = in.nextInt();
		System.out.println("Enter the smallest value");
		int small = in.nextInt();
		System.out.println("Enter the large value");
		int large = in.nextInt();
		int [] arr = new int[range];
		for(int ii=0;ii<arr.length;ii++){
			arr[ii]= random.nextInt(large);
		}
		print(arr);
		System.out.println("Main MEthod Ended");
	}
	public static void print(int[] args){
		for(Object val : args){
			System.out.print(val + "  ");
		}
		System.out.println();
	}
}
