package chapter6;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matrix = creatmatrix();
		System.out.println("主对角线的和是:"+ sumMajorDiagonal(matrix));

	}
	
	public static double[][] creatmatrix(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入行列数:");
		int n = input.nextInt();
		double[][] matrix = new double[n][n]; 
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数值:");
		for (int row = 0 ;row<n;row++) {
			for(int column = 0;column<n;column++)
				matrix[row][column]=input.nextDouble();
		}
		return matrix;
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum =0;
		for (int p =0;p<m.length;p++)
			sum = sum + m[p][p];
		return sum;
		
	}

}
