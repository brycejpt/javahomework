package chapter6;

import java.util.Scanner;

public class test1 {
	public static void reverse(int n) {
		
		int b =0;
		while(n>0) {
			int a = n%10;
			n=n/10;
			b=b*10+a;
		}
		System.out.println("反转后：" + b );  
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int m = input.nextInt();
		reverse(m);
		
	}
		

}

