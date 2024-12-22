package OPPS.L27Composition;

class College {

    private String collName;
    private int estYear;

    private final Department dept;
    private String deptName;
    private String hodName;

    public College(String collName, int estYear, String deptName, String hodName) {
        this.collName = collName;
        this.estYear = estYear;
        dept = new Department(deptName, hodName);
    }

    private class Department {

        private String deptName;
        private String hodName;

        private Department(String deptName, String hodName) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }
    public String toString(){
        return collName + "Department Name: " + estYear + " " + this.deptName + "Hod Name: " + this.hodName;
    }

    public void Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void showDetails(){
        System.out.println("college name " + this.collName);
        System.out.println("Establish year " + this.estYear);
        System.out.println("dept name " + this.deptName);
        System.out.println("hod name " + this.hodName);
        
    }
}






public class Compositions {

    public static void main(String[] args) {

        College c = new College("IIT DELHI", 2000, "CSE", "MR. KAMRAN");

        c.showDetails();
        System.out.println(c.toString());
        // c.dept.showDetails();

        
    
    }
}
