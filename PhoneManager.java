package study;

import java.util.Scanner;

class Phone2 {
	private String name, tel;
	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}

public class PhoneManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("인원수>>");
		count = sc.nextInt();
		
		Phone2[] ph = new Phone2[count];
		
		for(int i=0; i<count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>>");
			ph[i] = new Phone2(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String nname = sc.next();
			boolean flag = false;
			if(nname.equals("exit")) {
				break;
			}
			else {
				for(int i=0; i<count; i++) {
					if(nname.equals(ph[i].getName())) {
						System.out.println(ph[i].getName()+"의 번호는"+ph[i].getTel()+"입니다.");
						flag = true;
					}
					
				}
			}
			if(!flag) {
				System.out.println("고런사람 없음");
			}
		}
	}

}
