package OPPS.L3Encapsulation;

public class useStudent {
	public static void main(String[] args) {

		Student s = new Student();
		s.setStudent(1, "John", 89.7);
		s.showStudent();

		Student p = new Student();
		p.setStudent(2, "Peter", 78.9);
		p.showStudent();
	}
}
