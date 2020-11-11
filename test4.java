package chapter6;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numlist = creatlist();
		System.out.println("最小值的下表是"+indexOfSmallestElement(numlist));

	}
	
	public static double[] creatlist() {
		double[] list = new double[10];
		for(int i =0;i< list.length;i++) {
			Scanner in = new Scanner(System.in);
		    System.out.print("请输入第"+(i+1)+"个数："); 
		    list[i] = in.nextDouble();
		}
		return list;
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int j =0;
		for(int i = 0;i < array.length - 1;i++)
			if (array[i]>array[i+1])
				j=i+1;
			else
				j=j;
		return j;
		
	}

}
