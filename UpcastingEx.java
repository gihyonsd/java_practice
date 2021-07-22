package study;

class Person {
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Person p = new Student("이재문");
		Student s = (Student)p;
		s.grade="A";
		System.out.println(p.name);
		System.out.println(s.grade);

	}

}
