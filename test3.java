package chapter6;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberlist = creatlist();
		int[] counts = countlist(numberlist);
		displaycounts(counts);

	}
	
	public static int[] creatlist() {
		int[] list = new int[100];
		for(int i = 0;i<list.length;i++)
			list[i] = (int)(Math.random()*10);
		return list;
	}
	
	public static int[] countlist(int[] chars) {
		int[] counts = new int[10];
		for(int i = 0;i < chars.length;i++)
			counts[chars[i] - 0]++;
		return counts;
	}
	
	public static void displaycounts(int[] counts) {
		for(int i = 0;i < counts.length;i++)
			System.out.println(i+"出现的次数是"+counts[i]);
			
	}

}
