package SortPractice;

import java.util.Arrays;



class BubbleSort {
	public void buble(String array[]) {
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if((array[j].compareToIgnoreCase(array[j+1])) >0) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}

public class StringSort {

	public static void main(String[] args) {
		String array[] = {"B","C","A","D","E"};
		BubbleSort b = new BubbleSort();
		b.buble(array);

  }
}
