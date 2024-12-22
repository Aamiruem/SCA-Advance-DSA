package OPPS.L19Bindings;

public class UseBinding {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
        
        p.display(); // error
        p = new Child();

        p.show();
        p.display();
        
        // Child c = (Child) p;
    }
}
