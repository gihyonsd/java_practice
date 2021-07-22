package study;

import java.util.Scanner;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {return width*height;}
}

public class RectArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.print("계산할만큼 숫자 입력해라:");
		count = sc.nextInt();
		
		Rect[] Rca = new Rect[count];
		
		for(int i=0; i<count; i++) {
			System.out.print((i+1)+" 너비와 높이 >>");
			Rca[i] = new Rect(sc.nextInt(), sc.nextInt());
			sum += Rca[i].getArea();
		}
		System.out.println("저장되었습니다.");
		System.out.println("사각형의 전체  합은 " +sum);

	}

}
