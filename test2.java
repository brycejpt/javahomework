package chapter6;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int m = in.nextInt();
		printMartrix(m);

	}	
	public static void printMartrix(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(Math.random()<0.5)
					System.out.print("0");
				else 
					System.out.print("1");
			    }
			System.out.println("");
		}  		
	}
}
