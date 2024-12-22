package out.OPPS.L5GetterSetter;

public class ImmutableuserProduct {
    public static void main(String[] args) {

        ImmutableProduct p = new ImmutableProduct(100, "maggi", 35.0);

        System.out.println("Product id: " + p.getId());
        System.out.println("Product name: " + p.getName());
        System.out.println("Product price: " + p.getPrice());

        // Trying to change the product id
        // p.setId(200);
        // System.out.println("Trying to change product id: " + p.getId());

        // Trying to change the product name

        p.setName("Atta maggi"); // only name can change
        System.out.println("After name change ");

        // System.out.println("Trying to change product name: " + p.getName());

        // Trying to change the product price
        // p.setPrice(40.0);

        System.out.println("Product id: " + p.getId());

        System.out.println("Product name: " + p.getName());

        System.out.println("Product price: " + p.getPrice());
    }

}
