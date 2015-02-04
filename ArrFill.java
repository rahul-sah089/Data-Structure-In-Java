package dataStructureInJava;

import java.util.Arrays;
import java.util.Date;

public class ArrFill {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		Object[] a = new Object[4];
		Arrays.fill(a,new Date());
		print(a);
		Arrays.fill(a,1);
		print(a);
		Arrays.fill(a,"rahul");
		print(a);
		System.out.println("Main MEthod Ended");
	}
	public static void print(Object[] args){
		for(Object val:args){
			System.out.print(val + "  ");
		}
		System.out.println();
	}
}
