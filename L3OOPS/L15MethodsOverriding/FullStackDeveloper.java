package OPPS.L15MethodsOverriding;

public class FullStackDeveloper extends FrontEndDeveloper {
    public void mySkill(){
        super.mySkills();
        System.out.println("My skill is Full Stack Developer");

        // System.out.println("I can code with I know frontEnd part using HTML, CSS, JS, REACT, JAVA, I know backend part using NODEJS, MONGODB, EXPRESS");
        System.out.println();
    }
}
