package OPPS.L12ThisKeyword;


public class Student {
    // Instance variable
    private int roll;
    private String name;
    private double per;
    

    public void setStudent(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
    public void showStudent(){
        System.out.println("Roll is = : " + roll);
        System.out.println("Name is = : " + name);
        System.out.println("Percentage is = : " + per);
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
