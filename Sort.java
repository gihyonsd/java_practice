package SortPractice;

import java.util.Arrays;

public class Sort {
	

	public static void main(String[] args) {
		int[] array = {1,3,4,7,6,2,5};
		int[] array2 = {1,3,4,7,6,2,5};
		int[] array3 = {1,3,4,7,6,2,5};
		BubbleSort(array);
		SelectSort(array2);
		InsertSort(array3);

	}
	private static void BubbleSort(int[] array) {
		int temp = 0;
		int size = array.length-1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println("버블정렬 결과 :"+Arrays.toString(array));
		}
	}
	private static void SelectSort(int[] array2) {
		int temp = 0;
		int index = 0;
		for(int i = 0; i < array2.length-1; i++) {
			index = i;
			for(int j = i+1; j < array2.length; j++) {
				if(array2[index] > array2[j]) {
					index = j;
				}
			}
			temp = array2[i];
			array2[i] = array2[index];
			array2[index] = temp;
			
			System.out.println("선택정렬 결과:"+Arrays.toString(array2));;
		}
	}
	private static void InsertSort(int[] array3) {
		int temp = 0;
		int j = 0;
		
		for(int i = 1; i < array3.length; i++) {
			temp = array3[i];//삽입 대상 입시 저장
			j = i; //index 임시 저장
			while(j > 0 && temp < array3[j-1]) {//삽입 대상이 정렬 대상들보다 작은 경우
				array3[j] = array3[j-1];//밀기
				j--;//다음 비교를 위해 index 이동
			}
			array3[j] = temp; //최종적으로 삽입될 위치에 삽입대상 삽입
			System.out.println("삽입정렬 결과 :"+Arrays.toString(array3));
		}
	}

}
