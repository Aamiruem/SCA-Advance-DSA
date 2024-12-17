package OPPS.L3Encapsulation;

class Student {
	private int roll;
	private String name;
	private double per;

	public void setStudent(int r, String s, double p) {
		roll = r;
		name = s;
		per = p;
	}

	public void showStudent() {
		System.out.println("Roll No: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Percentage: " + per);
	}
}
