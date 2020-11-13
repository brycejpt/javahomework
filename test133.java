package chapter9;
import java.util.ArrayList;
import java.math.*;

public class test133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		sort(list);
		System.out.print(list);
		

	}
	
	public static void sort(ArrayList<Number> list) {
        if (list.size() == 0 || list == null)
            return ;
        for (int i = list.size()-1; i >= 0; i--) { //这里简单的冒泡排序，其他大同小异
            for (int j = 0; j < i; j++) {
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
                    int index = j;
                    Number m = list.get(j);
                    list.set(index, list.get(j+1));
                    list.set(j+1, m);
                }
            }
        }
    
	}

}