package OPPS.L1ClassAndObject;
//class Student {
//	int roll;
//	String name;
//	double per;
//}

public class useStudent {
	public static void main(String[] args) {
		Student s = new Student();
        s.roll = 1;
		s.name = "John";
		s.per = 89.7;
		System.out.println ("Roll No: " + s.roll + "\nName: " + s.name + "\nPercentage: " + s.per + "\n" );

	}
}
