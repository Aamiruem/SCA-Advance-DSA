package out.OPPS.L5GetterSetter;

public class userProduct {
    // Driver class

    public static void main(String[] args) {

        Product p = new Product();

        p.setId(100);
        p.setPrice(35.0);
        p.setName("MAGGI");

        // System.out.println("Product id: " + p.getId() + "\nProduct name: " + p.getName() + "\nProduct price: " + p.getPrice());

        System.out.println("Product id: " + p.getId());

        System.out.println("Product name: " + p.getName());

        System.out.println("Product price: " + p.getPrice());
        

    }
    
}
