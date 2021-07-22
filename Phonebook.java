package study;

import java.util.*;

class Phone {
	private String name;
	private String tel;
	private String addr;
	
	public Phone(String name, String tel, String addr) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return "phone [name=" +name+",tel="+tel+",addr="+addr+"]";
	}
}
public class Phonebook {
	private Scanner sc;
	private Map<String, Phone> phoneBookMap;
	
	public Phonebook() {
		sc = new Scanner(System.in);
		phoneBookMap = new HashMap<>();
	}
	public void menu() {
		System.out.println();
		System.out.println("메뉴 선택");
		System.out.println("1.등록 2.추가 3.찾기 4.삭제");
		System.out.println("0 은 프로그램 종료");
	}
	public void Start() {
		while(true) {
			menu();
			
			int num = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
