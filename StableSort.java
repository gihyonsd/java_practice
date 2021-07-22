package study;

import java.util.Arrays;

class SelectSort {
	
	public void sort(int array[]) {
		int min = 0;
		int index = 0;
		int temp = 0;
		
		for(int i=0; i<array.length-1; i++) {
			min = array[i];
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = min;
			array[index] = temp;
		
		}
		System.out.println(Arrays.toString(array));
		
	}
	

}
class BubleSort {
	public void buble(int array[]) {
		
		int temp = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}

public class StableSort {

	public static void main(String[] args) {
		int array[] = {9,8,5,6,2};
		SelectSort s = new SelectSort();
		BubleSort b = new BubleSort();
		s.sort(array);
		b.buble(array);

	}

}
